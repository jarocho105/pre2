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

import com.bydan.erp.cartera.util.TransporteConstantesFunciones;
import com.bydan.erp.cartera.util.TransporteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TransporteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TransporteBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TransporteBeanSwingJInternalFrame extends TransporteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TransporteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Transporte> transporteValidator = new ClassValidator<Transporte>(Transporte.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Transporte transporte;	
	public Transporte transporteAux;
	public Transporte transporteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Transporte transporteTotales;
	public Long idTransporteActual;
	public Long iIdNuevoTransporte=0L;
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

	public String sFinalQueryComboTipoViaTransporte="";

	public List<TipoViaTransporte> tipoviatransportesForeignKey;

	public List<TipoViaTransporte> gettipoviatransportesForeignKey() {
		return tipoviatransportesForeignKey;
	}

	public void settipoviatransportesForeignKey(List<TipoViaTransporte> tipoviatransportesForeignKey) {
		this.tipoviatransportesForeignKey = tipoviatransportesForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoViaTransporte tipoviatransporteForeignKey;

	public TipoViaTransporte gettipoviatransporteForeignKey() {
		return tipoviatransporteForeignKey;
	}

	public void settipoviatransporteForeignKey(TipoViaTransporte tipoviatransporteForeignKey) {
		this.tipoviatransporteForeignKey = tipoviatransporteForeignKey;
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
	
	public Boolean isPermisoTodoTransporte;
	public Boolean isPermisoNuevoTransporte;
	public Boolean isPermisoActualizarTransporte;
	public Boolean isPermisoActualizarOriginalTransporte;
	public Boolean isPermisoEliminarTransporte;
	public Boolean isPermisoGuardarCambiosTransporte;
	public Boolean isPermisoConsultaTransporte;
	public Boolean isPermisoBusquedaTransporte;
	public Boolean isPermisoReporteTransporte;
	public Boolean isPermisoPaginacionMedioTransporte;
	public Boolean isPermisoPaginacionAltoTransporte;
	public Boolean isPermisoPaginacionTodoTransporte;
	public Boolean isPermisoCopiarTransporte;
	public Boolean isPermisoVerFormTransporte;
	public Boolean isPermisoDuplicarTransporte;
	public Boolean isPermisoOrdenTransporte;
	
	
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
	
	public TransporteParameterReturnGeneral transporteReturnGeneral;
	public TransporteParameterReturnGeneral transporteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTransporte=false;
	public Boolean esParaAccionDesdeFormularioTransporte=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TransporteSessionBeanAdditional transporteSessionBeanAdditional=null;
	
	public TransporteSessionBeanAdditional getTransporteSessionBeanAdditional() {
		return this.transporteSessionBeanAdditional;
	}
	
	public void setTransporteSessionBeanAdditional(TransporteSessionBeanAdditional transporteSessionBeanAdditional) {
		try {
			this.transporteSessionBeanAdditional=transporteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TransporteBeanSwingJInternalFrameAdditional transporteBeanSwingJInternalFrameAdditional=null;
	//public class TransporteBeanSwingJInternalFrame
	
	public TransporteBeanSwingJInternalFrameAdditional getTransporteBeanSwingJInternalFrameAdditional() {
		return this.transporteBeanSwingJInternalFrameAdditional;
	}
	
	public void setTransporteBeanSwingJInternalFrameAdditional(TransporteBeanSwingJInternalFrameAdditional transporteBeanSwingJInternalFrameAdditional) {
		try {
			this.transporteBeanSwingJInternalFrameAdditional=transporteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TransporteLogic transporteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Transporte transporteBean;
	public TransporteConstantesFunciones transporteConstantesFunciones;
	//public TransporteParameterReturnGeneral transporteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoViaTransporteLogic tipoviatransporteLogic;
	
	//PARAMETROS
	
	
	//public List<Transporte> transportes;	
	//public List<Transporte> transportesEliminados;
	//public List<Transporte> transportesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTransporte=false;
	public Boolean isVisibilidadCeldaDuplicarTransporte=true;
	public Boolean isVisibilidadCeldaCopiarTransporte=true;
	public Boolean isVisibilidadCeldaVerFormTransporte=true;
	public Boolean isVisibilidadCeldaOrdenTransporte=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTransporte=false;
	public Boolean isVisibilidadCeldaModificarTransporte=false;
	public Boolean isVisibilidadCeldaActualizarTransporte=false;
	public Boolean isVisibilidadCeldaEliminarTransporte=false;
	public Boolean isVisibilidadCeldaCancelarTransporte=false;
	public Boolean isVisibilidadCeldaGuardarTransporte=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTransporte=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoViaTransporte=false;
	
	public Long getiIdNuevoTransporte() {
		return this.iIdNuevoTransporte;
	}

	public void setiIdNuevoTransporte(Long iIdNuevoTransporte) {
		this.iIdNuevoTransporte = iIdNuevoTransporte;
	}
	
	public Long getidTransporteActual() {
		return this.idTransporteActual;
	}

	public void setidTransporteActual(Long idTransporteActual) {
		this.idTransporteActual = idTransporteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Transporte gettransporte() {
		return this.transporte;
	}

	public void settransporte(Transporte transporte) {
		this.transporte = transporte;
	}
	
	public Transporte gettransporteAux() {
		return this.transporteAux;
	}

	public void settransporteAux(Transporte transporteAux) {
		this.transporteAux = transporteAux;
	}				
	
	public Transporte gettransporteAnterior() {
		return this.transporteAnterior;
	}

	public void settransporteAnterior(Transporte transporteAnterior) {
		this.transporteAnterior = transporteAnterior;
	}	
	
	public Transporte gettransporteTotales() {
		return this.transporteTotales;
	}

	public void settransporteTotales(Transporte transporteTotales) {
		this.transporteTotales = transporteTotales;
	}	
	
	public Transporte gettransporteBean() {
		return this.transporteBean;
	}

	public void settransporteBean(Transporte transporteBean) {
		this.transporteBean = transporteBean;
	}	
	
	public TransporteParameterReturnGeneral gettransporteReturnGeneral() {
		return this.transporteReturnGeneral;
	}

	public void settransporteReturnGeneral(TransporteParameterReturnGeneral transporteReturnGeneral) {
		this.transporteReturnGeneral = transporteReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
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

	public Long id_tipo_via_transporteFK_IdTipoViaTransporte=-1L;

	public Long getid_tipo_via_transporteFK_IdTipoViaTransporte() {
		return this.id_tipo_via_transporteFK_IdTipoViaTransporte;
	}

	public void setid_tipo_via_transporteFK_IdTipoViaTransporte(Long id_tipo_via_transporteFK_IdTipoViaTransporte) {
		this.id_tipo_via_transporteFK_IdTipoViaTransporte = id_tipo_via_transporteFK_IdTipoViaTransporte;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TransporteLogic getTransporteLogic()	{		
		return transporteLogic;
	}

	public void setTransporteLogic(TransporteLogic transporteLogic) {
		this.transporteLogic = transporteLogic;
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
	
	public Boolean getIsEsNuevoTransporte() {
		return isEsNuevoTransporte;
	}

	public void setIsEsNuevoTransporte(Boolean isEsNuevoTransporte) {
		this.isEsNuevoTransporte = isEsNuevoTransporte;
	}

	public Boolean getEsParaAccionDesdeFormularioTransporte() {
		return esParaAccionDesdeFormularioTransporte;
	}
	
	public void setEsParaAccionDesdeFormularioTransporte(Boolean esParaAccionDesdeFormularioTransporte) {
		this.esParaAccionDesdeFormularioTransporte = esParaAccionDesdeFormularioTransporte;
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

			if(this.transporteSessionBean==null) {
				this.transporteSessionBean=new TransporteSessionBean();
			}

			if(!this.transporteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(transporteSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoViaTransportesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoviatransportesForeignKey=new ArrayList<TipoViaTransporte>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoViaTransporteLogic tipoviatransporteLogic=new TipoViaTransporteLogic();

			//tipoviatransporteLogic.getTipoViaTransporteDataAccess().setIsForForeingKeyData(true);

			if(this.transporteSessionBean==null) {
				this.transporteSessionBean=new TransporteSessionBean();
			}

			if(!this.transporteSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoviatransporteLogic.getTipoViaTransporteDataAccess().setIsForForeingKeyData(true);

					tipoviatransporteLogic.getTodosTipoViaTransportesWithConnection(sFinalQuery,new Pagination());

					this.tipoviatransportesForeignKey=tipoviatransporteLogic.getTipoViaTransportes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoViaTransporte(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoviatransporteLogic.getEntityWithConnection(transporteSessionBean.getlidTipoViaTransporteActual());
					this.tipoviatransportesForeignKey.add(tipoviatransporteLogic.getTipoViaTransporte());
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

					if(this.transporte!=null) {
						this.transporte.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTransporte!=null) {
						this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTransporte.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTransporte!=null) {
						if(this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTransporteGenerico)throws Exception
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
				jComboBoxid_empresaTransporteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTransporteGenerico!=null && jComboBoxid_empresaTransporteGenerico.getItemCount()>0) {
					jComboBoxid_empresaTransporteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoViaTransporteForeignKey(Long idTipoViaTransporteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoViaTransporte  tipoviatransporteTemp=null;

			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesForeignKey) {
				if(tipoviatransporteAux.getId()!=null && tipoviatransporteAux.getId().equals(idTipoViaTransporteSeleccionado)) {
					tipoviatransporteTemp=tipoviatransporteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoviatransporteTemp!=null) {

					if(this.transporte!=null) {
						this.transporte.setTipoViaTransporte(tipoviatransporteTemp);
					}

					if(this.jInternalFrameDetalleFormTransporte!=null) {
						this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.setSelectedItem(tipoviatransporteTemp);
					}
				} else {
					//jComboBoxid_tipo_via_transporteTransporte.setSelectedItem(tipoviatransporteTemp);
					if(this.jInternalFrameDetalleFormTransporte!=null) {
						if(this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoViaTransporte") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoviatransporteTemp!=null && jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte!=null) {
						jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setSelectedItem(tipoviatransporteTemp);
					} else {
						if(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte!=null) {
							//jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setSelectedItem(tipoviatransporteTemp);
							if(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.getItemCount()>0) {
								jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setSelectedIndex(0);
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

	public String getActualTipoViaTransporteForeignKeyDescripcion(Long idTipoViaTransporteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoViaTransporte  tipoviatransporteTemp=null;

			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesForeignKey) {
				if(tipoviatransporteAux.getId()!=null && tipoviatransporteAux.getId().equals(idTipoViaTransporteSeleccionado)) {
					tipoviatransporteTemp=tipoviatransporteAux;
					break;
				}
			}


			sDescripcion=TipoViaTransporteConstantesFunciones.getTipoViaTransporteDescripcion(tipoviatransporteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoViaTransporteForeignKeyGenerico(Long idTipoViaTransporteSeleccionado,JComboBox jComboBoxid_tipo_via_transporteTransporteGenerico)throws Exception
	{
		try
		{
			TipoViaTransporte  tipoviatransporteTemp=null;

			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesForeignKey) {
				if(tipoviatransporteAux.getId()!=null && tipoviatransporteAux.getId().equals(idTipoViaTransporteSeleccionado)) {
					tipoviatransporteTemp=tipoviatransporteAux;
					break;
				}
			}

			if(tipoviatransporteTemp!=null) {
				jComboBoxid_tipo_via_transporteTransporteGenerico.setSelectedItem(tipoviatransporteTemp);
			} else {
				if(jComboBoxid_tipo_via_transporteTransporteGenerico!=null && jComboBoxid_tipo_via_transporteTransporteGenerico.getItemCount()>0) {
					jComboBoxid_tipo_via_transporteTransporteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Transporte transporte,JComboBox jComboBoxid_empresaTransporteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTransporteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTransporteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				transporte.setid_empresa(empresaAux.getId());
				transporte.setempresa_descripcion(TransporteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				transporte.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoViaTransporteForeignKey(Transporte transporte,JComboBox jComboBoxid_tipo_via_transporteTransporteGenerico)throws Exception
	{
		try
		{
			TipoViaTransporte  tipoviatransporteAux=new TipoViaTransporte();

			if(jComboBoxid_tipo_via_transporteTransporteGenerico==null) {
				tipoviatransporteAux=(TipoViaTransporte)this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.getSelectedItem();
			} else {
				tipoviatransporteAux=(TipoViaTransporte)jComboBoxid_tipo_via_transporteTransporteGenerico.getSelectedItem();
			}

			if(tipoviatransporteAux!=null && tipoviatransporteAux.getId()!=null) {
				transporte.setid_tipo_via_transporte(tipoviatransporteAux.getId());
				transporte.settipoviatransporte_descripcion(TransporteConstantesFunciones.getTipoViaTransporteDescripcion(tipoviatransporteAux));
				transporte.setTipoViaTransporte(tipoviatransporteAux);			}
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

					if(!TransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransporte!=null) { 
							this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransporte!=null) { 
					}

					if(!TransporteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoViaTransportesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoViaTransporte=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransporte!=null) { 
							this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.removeAllItems();

							for(TipoViaTransporte tipoviatransporte:this.tipoviatransportesForeignKey) {
								this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.addItem(tipoviatransporte);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransporte!=null) { 
					}

					if(!TransporteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoViaTransporte") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransporteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.removeAllItems();

							for(TipoViaTransporte tipoviatransporte:this.tipoviatransportesForeignKey) {
								this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.addItem(tipoviatransporte);
							}
						}

						if(!TransporteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTransporte!=null) {
							this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransporte!=null) {
							this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoViaTransporteForeignKey(TipoViaTransporte tipoviatransporte,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransporte!=null) {
							this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.setSelectedItem(tipoviatransporte);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransporte!=null) {
							this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setSelectedItem(tipoviatransporte);
						} else {
							this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTransporte() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TransporteConstantesFunciones.refrescarForeignKeysDescripcionesTransporte(this.transporteLogic.getTransportes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TransporteConstantesFunciones.refrescarForeignKeysDescripcionesTransporte(this.transportes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoViaTransporte.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//transporteLogic.setTransportes(this.transportes);
			transporteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TransporteParameterReturnGeneral getTransporteParameterGeneral() {
		return this.transporteParameterGeneral;
	}
	
	public void setTransporteParameterGeneral(TransporteParameterReturnGeneral transporteParameterGeneral) {
		this.transporteParameterGeneral = transporteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTransporte() {
		return isPermisoTodoTransporte;
	}

	public void setIsPermisoTodoTransporte(Boolean isPermisoTodoTransporte) {
		this.isPermisoTodoTransporte = isPermisoTodoTransporte;
	}

	public Boolean getIsPermisoNuevoTransporte() {
		return isPermisoNuevoTransporte;
	}

	public void setIsPermisoNuevoTransporte(Boolean isPermisoNuevoTransporte) {
		this.isPermisoNuevoTransporte = isPermisoNuevoTransporte;
	}

	public Boolean getIsPermisoActualizarTransporte() {
		return isPermisoActualizarTransporte;
	}

	public void setIsPermisoActualizarTransporte(Boolean isPermisoActualizarTransporte) {
		this.isPermisoActualizarTransporte = isPermisoActualizarTransporte;
	}

	public Boolean getIsPermisoEliminarTransporte() {
		return isPermisoEliminarTransporte;
	}

	public void setIsPermisoEliminarTransporte(Boolean isPermisoEliminarTransporte) {
		this.isPermisoEliminarTransporte = isPermisoEliminarTransporte;
	}

	public Boolean getIsPermisoGuardarCambiosTransporte() {
		return isPermisoGuardarCambiosTransporte;
	}

	public void setIsPermisoGuardarCambiosTransporte(Boolean isPermisoGuardarCambiosTransporte) {
		this.isPermisoGuardarCambiosTransporte = isPermisoGuardarCambiosTransporte;
	}
	
	public Boolean getIsPermisoConsultaTransporte() {
		return isPermisoConsultaTransporte;
	}

	public void setIsPermisoConsultaTransporte(Boolean isPermisoConsultaTransporte) {
		this.isPermisoConsultaTransporte = isPermisoConsultaTransporte;
	}

	public Boolean getIsPermisoBusquedaTransporte() {
		return isPermisoBusquedaTransporte;
	}

	public void setIsPermisoBusquedaTransporte(Boolean isPermisoBusquedaTransporte) {
		this.isPermisoBusquedaTransporte = isPermisoBusquedaTransporte;
	}

	public Boolean getIsPermisoReporteTransporte() {
		return isPermisoReporteTransporte;
	}

	public void setIsPermisoReporteTransporte(Boolean isPermisoReporteTransporte) {
		this.isPermisoReporteTransporte = isPermisoReporteTransporte;
	}
	
	public Boolean getIsPermisoPaginacionMedioTransporte() {
		return isPermisoPaginacionMedioTransporte;
	}

	public void setIsPermisoPaginacionMedioTransporte(Boolean isPermisoPaginacionMedioTransporte) {
		this.isPermisoPaginacionMedioTransporte = isPermisoPaginacionMedioTransporte;
	}
	
	public Boolean getIsPermisoPaginacionTodoTransporte() {
		return isPermisoPaginacionTodoTransporte;
	}

	public void setIsPermisoPaginacionTodoTransporte(Boolean isPermisoPaginacionTodoTransporte) {
		this.isPermisoPaginacionTodoTransporte = isPermisoPaginacionTodoTransporte;
	}
	
	public Boolean getIsPermisoPaginacionAltoTransporte() {
		return isPermisoPaginacionAltoTransporte;
	}

	public void setIsPermisoPaginacionAltoTransporte(Boolean isPermisoPaginacionAltoTransporte) {
		this.isPermisoPaginacionAltoTransporte = isPermisoPaginacionAltoTransporte;
	}
	
	public Boolean getIsPermisoCopiarTransporte() {
		return isPermisoCopiarTransporte;
	}

	public void setIsPermisoCopiarTransporte(Boolean isPermisoCopiarTransporte) {
		this.isPermisoCopiarTransporte = isPermisoCopiarTransporte;
	}
	
	public Boolean getIsPermisoVerFormTransporte() {
		return isPermisoVerFormTransporte;
	}

	public void setIsPermisoVerFormTransporte(Boolean isPermisoVerFormTransporte) {
		this.isPermisoVerFormTransporte = isPermisoVerFormTransporte;
	}
	
	public Boolean getIsPermisoDuplicarTransporte() {
		return isPermisoDuplicarTransporte;
	}

	public void setIsPermisoDuplicarTransporte(Boolean isPermisoDuplicarTransporte) {
		this.isPermisoDuplicarTransporte = isPermisoDuplicarTransporte;
	}
	
	public Boolean getIsPermisoOrdenTransporte() {
		return isPermisoOrdenTransporte;
	}

	public void setIsPermisoOrdenTransporte(Boolean isPermisoOrdenTransporte) {
		this.isPermisoOrdenTransporte = isPermisoOrdenTransporte;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTransporte() {
		return isVisibilidadCeldaNuevoTransporte;
	}

	public void setIsVisibilidadCeldaNuevoTransporte(Boolean isVisibilidadCeldaNuevoTransporte) {
		this.isVisibilidadCeldaNuevoTransporte = isVisibilidadCeldaNuevoTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTransporte() {
		return isVisibilidadCeldaDuplicarTransporte;
	}

	public void setIsVisibilidadCeldaDuplicarTransporte(Boolean isVisibilidadCeldaDuplicarTransporte) {
		this.isVisibilidadCeldaDuplicarTransporte = isVisibilidadCeldaDuplicarTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTransporte() {
		return isVisibilidadCeldaCopiarTransporte;
	}

	public void setIsVisibilidadCeldaCopiarTransporte(Boolean isVisibilidadCeldaCopiarTransporte) {
		this.isVisibilidadCeldaCopiarTransporte = isVisibilidadCeldaCopiarTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTransporte() {
		return isVisibilidadCeldaVerFormTransporte;
	}

	public void setIsVisibilidadCeldaVerFormTransporte(Boolean isVisibilidadCeldaVerFormTransporte) {
		this.isVisibilidadCeldaVerFormTransporte = isVisibilidadCeldaVerFormTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTransporte() {
		return isVisibilidadCeldaOrdenTransporte;
	}

	public void setIsVisibilidadCeldaOrdenTransporte(Boolean isVisibilidadCeldaOrdenTransporte) {
		this.isVisibilidadCeldaOrdenTransporte = isVisibilidadCeldaOrdenTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTransporte() {
		return isVisibilidadCeldaNuevoRelacionesTransporte;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTransporte(Boolean isVisibilidadCeldaNuevoRelacionesTransporte) {
		this.isVisibilidadCeldaNuevoRelacionesTransporte = isVisibilidadCeldaNuevoRelacionesTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTransporte() {
		return isVisibilidadCeldaModificarTransporte;
	}

	public void setIsVisibilidadCeldaModificarTransporte(Boolean isVisibilidadCeldaModificarTransporte) {
		this.isVisibilidadCeldaModificarTransporte = isVisibilidadCeldaModificarTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTransporte() {
		return isVisibilidadCeldaActualizarTransporte;
	}

	public void setIsVisibilidadCeldaActualizarTransporte(Boolean isVisibilidadCeldaActualizarTransporte) {
		this.isVisibilidadCeldaActualizarTransporte = isVisibilidadCeldaActualizarTransporte;
	}

	public Boolean getIsVisibilidadCeldaEliminarTransporte() {
		return isVisibilidadCeldaEliminarTransporte;
	}

	public void setIsVisibilidadCeldaEliminarTransporte(Boolean isVisibilidadCeldaEliminarTransporte) {
		this.isVisibilidadCeldaEliminarTransporte = isVisibilidadCeldaEliminarTransporte;
	}

	public Boolean getIsVisibilidadCeldaCancelarTransporte() {
		return isVisibilidadCeldaCancelarTransporte;
	}

	public void setIsVisibilidadCeldaCancelarTransporte(Boolean isVisibilidadCeldaCancelarTransporte) {
		this.isVisibilidadCeldaCancelarTransporte = isVisibilidadCeldaCancelarTransporte;
	}

	public Boolean getIsVisibilidadCeldaGuardarTransporte() {
		return isVisibilidadCeldaGuardarTransporte;
	}

	public void setIsVisibilidadCeldaGuardarTransporte(Boolean isVisibilidadCeldaGuardarTransporte) {
		this.isVisibilidadCeldaGuardarTransporte = isVisibilidadCeldaGuardarTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTransporte() {
		return isVisibilidadCeldaGuardarCambiosTransporte;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTransporte(Boolean isVisibilidadCeldaGuardarCambiosTransporte) {
		this.isVisibilidadCeldaGuardarCambiosTransporte = isVisibilidadCeldaGuardarCambiosTransporte;
	}
		
	public TransporteSessionBean gettransporteSessionBean() {
		return this.transporteSessionBean;
	}
	
	public void settransporteSessionBean(TransporteSessionBean transporteSessionBean) {
		this.transporteSessionBean=transporteSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
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

	public Boolean getisVisibilidadFK_IdTipoViaTransporte() {
		return this.isVisibilidadFK_IdTipoViaTransporte;
	}

	public void setisVisibilidadFK_IdTipoViaTransporte(Boolean isVisibilidadFK_IdTipoViaTransporte) {
		this.isVisibilidadFK_IdTipoViaTransporte=isVisibilidadFK_IdTipoViaTransporte;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTransporte(Transporte transporte)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(transporte,null);
				this.setActualParaGuardarTipoViaTransporteForeignKey(transporte,null);
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
	
	public void bugActualizarReferenciaActual(Transporte transporte,Transporte transporteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTransporte(transporte);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		transporteAux.setId(transporte.getId());
		transporteAux.setVersionRow(transporte.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTransporte();
		
			int intSelectedRow = this.jTableDatosTransporte.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTransporte(this.transporte,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = transporteValidator.getInvalidValues(this.transporte);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			transporteLogic.setDatosCliente(datosCliente);
			transporteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				transporteAux=new  Transporte();
				
				transporteAux.setIsNew(true);
				transporteAux.setIsChanged(true);
				
				transporteAux.setTransporteOriginal(this.transporte);
				
				transporteAux.setId(this.transporte.getId());	
				transporteAux.setVersionRow(this.transporte.getVersionRow());	
				transporteAux.setid_empresa(this.transporte.getid_empresa());	
				transporteAux.setid_tipo_via_transporte(this.transporte.getid_tipo_via_transporte());	
				transporteAux.setcodigo(this.transporte.getcodigo());	
				transporteAux.setnombre(this.transporte.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transporteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transporteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(transporteAux,transporteLogic.getTransportes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transporteAux,transportes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.transporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transporteLogic.saveTransportes();//WithConnection
						//transporteLogic.getSetVersionRowTransportes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transporte,transporteAux);
					
					this.refrescarForeignKeysDescripcionesTransporte();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				transporteAux=new  Transporte();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.transporteSessionBean.getEsGuardarRelacionado() 
					|| (this.transporteSessionBean.getEsGuardarRelacionado() && this.transporte.getId()>=0)) {
						
					transporteAux.setIsNew(false);
				}
				
				transporteAux.setIsDeleted(false);
			
				transporteAux.setId(this.transporte.getId());	
				transporteAux.setVersionRow(this.transporte.getVersionRow());	
				transporteAux.setid_empresa(this.transporte.getid_empresa());	
				transporteAux.setid_tipo_via_transporte(this.transporte.getid_tipo_via_transporte());	
				transporteAux.setcodigo(this.transporte.getcodigo());	
				transporteAux.setnombre(this.transporte.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transporteAux,transporteLogic.getTransportes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transporteAux,transportes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.transporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transporteLogic.saveTransportes();//WithConnection
						//transporteLogic.getSetVersionRowTransportes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transporte,transporteAux);
					
					this.refrescarForeignKeysDescripcionesTransporte();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				transporteAux=new  Transporte();
				
				transporteAux.setIsNew(false);
				transporteAux.setIsChanged(false);
				
				transporteAux.setIsDeleted(true);
				
				transporteAux.setId(this.transporte.getId());	
				transporteAux.setVersionRow(this.transporte.getVersionRow());	
				transporteAux.setid_empresa(this.transporte.getid_empresa());	
				transporteAux.setid_tipo_via_transporte(this.transporte.getid_tipo_via_transporte());	
				transporteAux.setcodigo(this.transporte.getcodigo());	
				transporteAux.setnombre(this.transporte.getnombre());	
				
				if(this.transporteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.transporteAux.getId()>=0) {	
						this.transportesEliminados.add(transporteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(transporteAux,transporteLogic.getTransportes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transporteAux,transportes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.transporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transporteLogic.saveTransportes();//WithConnection
						//transporteLogic.getSetVersionRowTransportes();//WithConnection
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
					this.transporteLogic.getTransportes().addAll(this.transportesEliminados);
					
					transporteLogic.saveTransportes();//WithConnection
					//transporteLogic.getSetVersionRowTransportes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTransporte();
				
				this.transportesEliminados= new ArrayList<Transporte>();		
			}
			
			if(this.transporteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Transporte GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Transporte",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.transporte=transporteAux;
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
      		//this.finishProcessTransporte();
      	}
		
	}	
	
	public void actualizarRelaciones(Transporte transporteLocal) throws Exception {
		
		if(this.transporteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Transporte transporteLocal) throws Exception {	
		if(this.transporteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				transporteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoViaTransporteDetalleFormJInternalFrame.class)) {
				TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrameLocal=(TipoViaTransporteBeanSwingJInternalFrame) ((TipoViaTransporteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoviatransporteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoViaTransporte(tipoviatransporteBeanSwingJInternalFrameLocal.gettipoviatransporte(),true);
				tipoviatransporteBeanSwingJInternalFrameLocal.actualizarLista(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte,this.tipoviatransportesForeignKey);

				tipoviatransporteBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte);

				transporteLocal.setTipoViaTransporte(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte);

				this.addItemDefectoCombosForeignKeyTipoViaTransporte();
				this.cargarCombosFrameTipoViaTransportesForeignKey("Formulario");
				this.setActualTipoViaTransporteForeignKey(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTransporteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = transporteValidator.getInvalidValues(this.transporte);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Transporte transporte,List<Transporte> transportes) throws Exception {
		try	{		
			TransporteConstantesFunciones.actualizarLista(transporte,transportes,this.transporteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Transporte transporte,List<Transporte> transportes) throws Exception {
		try	{			
			TransporteConstantesFunciones.actualizarSelectedLista(transporte,transportes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Transporte> transportesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				transportesLocal=this.transporteLogic.getTransportes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				transportesLocal=this.transportes;
			}
			//ARCHITECTURE
		
			for(Transporte transporteLocal:transportesLocal) {
				if(this.permiteMantenimiento(transporteLocal) && transporteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TransporteConstantesFunciones.getTransporteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TransporteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransporte.jLabelid_empresaTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransporteConstantesFunciones.IDTIPOVIATRANSPORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransporte.jLabelid_tipo_via_transporteTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransporteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransporte.jLabelcodigoTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransporteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransporte.jLabelnombreTransporte,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTransporte!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransporte.jLabelid_empresaTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransporte.jLabelid_tipo_via_transporteTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransporte.jLabelcodigoTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransporte.jLabelnombreTransporte,"");
		
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
		this.iIdNuevoTransporte--;	
		
		
		this.transporteAux=new Transporte();
		
		this.transporteAux.setId(this.iIdNuevoTransporte);
		this.transporteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transporteLogic.getTransportes().add(this.transporteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.transportes.add(this.transporteAux);
		}
		//ARCHITECTURE
		
		this.transporte=this.transporteAux;
		
		if(TransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTransporte(this.transporte);
			this.setVariablesObjetoActualToFormularioForeignKeyTransporte(this.transporte);
		}
				
		//this.setDefaultControlesTransporte();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTransporte();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTransporte();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransporte();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransporte(this.transporteBean,this.transporte,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TransporteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.transporteSessionBean.getConGuardarRelaciones()) {
			classes=TransporteConstantesFunciones.getClassesRelationshipsOfTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.transporteReturnGeneral=transporteLogic.procesarEventosTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transporteLogic.getTransportes(),this.transporte,this.transporteParameterGeneral,this.isEsNuevoTransporte,classes);//this.transporteLogic.getTransporte()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTransporte(this.transporteReturnGeneral,this.transporteBean,false);
		
		if(this.transporteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTransporte(this.transporteReturnGeneral.getTransporte());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTransporte(this.transporteReturnGeneral.getTransporte());
		}
		
		if(this.transporteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTransporte(this.transporteReturnGeneral.getTransporte(),classes);//this.transporteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTransporte(this.transporte,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTransporte();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTransporte();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransporteBeanSwingJInternalFrameAdditional.RecargarFormTransporte(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTransporte(false);
						
			if(transporteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransporte();
			}
			
			this.actualizarVisualTableDatosTransporte();
			
			this.jTableDatosTransporte.setRowSelectionInterval(this.getIndiceNuevoTransporte(), this.getIndiceNuevoTransporte());
			
			this.seleccionarFilaTablaTransporteActual();
						
			this.actualizarEstadoCeldasBotonesTransporte("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTransporte(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTransporte.jTextFieldcodigoTransporte.setEnabled(isHabilitar && this.transporteConstantesFunciones.activarcodigoTransporte);
		this.jInternalFrameDetalleFormTransporte.jTextAreanombreTransporte.setEnabled(isHabilitar && this.transporteConstantesFunciones.activarnombreTransporte);	
		//
		this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.setEnabled(isHabilitar && this.transporteConstantesFunciones.activarid_empresaTransporte);
		this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.setEnabled(isHabilitar && this.transporteConstantesFunciones.activarid_tipo_via_transporteTransporte);
	};
	
	public void setDefaultControlesTransporte() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTransporte(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.transporteSessionBean.setConGuardarRelaciones(true);			
			this.transporteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTransporte.jTabbedPaneRelacionesTransporte.setVisible(true);
			
					
		} else {
			//this.transporteSessionBean.setConGuardarRelaciones(false);			
			this.transporteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTransporte.jTabbedPaneRelacionesTransporte.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTransporte() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transporte transporteAux:this.transporteLogic.getTransportes()) {
				if(transporteAux.getId().equals(this.iIdNuevoTransporte)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transporte transporteAux:this.transportes) {
				if(transporteAux.getId().equals(this.iIdNuevoTransporte)) {
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
	
	public int getIndiceActualTransporte(Transporte transporte,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transporte transporteAux:this.transporteLogic.getTransportes()) {
				if(transporteAux.getId().equals(transporte.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transporte transporteAux:this.transportes) {
				if(transporteAux.getId().equals(transporte.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTransporte(Transporte transporteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transporte transporteAux:this.transporteLogic.getTransportes()) {
				if(transporteAux.getTransporteOriginal().getId().equals(transporteOriginal.getId())) {
					existe=true;
					transporteOriginal.setId(transporteAux.getId());
					transporteOriginal.setVersionRow(transporteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transporte transporteAux:this.transportes) {
				if(transporteAux.getTransporteOriginal().getId().equals(transporteOriginal.getId())) {
					existe=true;
					transporteOriginal.setId(transporteAux.getId());
					transporteOriginal.setVersionRow(transporteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTransporte(Boolean esParaCancelar) throws Exception {
		transportesAux=new ArrayList<Transporte>();
		transporteAux=new Transporte();
		
		if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Transporte transporteAux:this.transporteLogic.getTransportes()) {
					if(transporteAux.getId()<0) {
						transportesAux.add(transporteAux);
					}		
				}
				this.iIdNuevoTransporte=0L;
				this.transporteLogic.getTransportes().removeAll(transportesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transporte transporteAux:this.transportes) {
					if(transporteAux.getId()<0) {
						transportesAux.add(transporteAux);
					}		
				}
				this.iIdNuevoTransporte=0L;
				this.transportes.removeAll(transportesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTransporte 
					&& this.transporteLogic.getTransportes().size()>0
					) {
					transporteAux=this.transporteLogic.getTransportes().get(this.transporteLogic.getTransportes().size() - 1);
				
					if(transporteAux.getId()<0) {
						this.transporteLogic.getTransportes().remove(transporteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTransporte && this.transportes.size()>0) {
					transporteAux=this.transportes.get(this.transportes.size() - 1);
				
					if(transporteAux.getId()<0) {
						this.transportes.remove(transporteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTransporte(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(transporte.getId()<0) {
				this.transporteLogic.getTransportes().remove(this.transporte);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(transporte.getId()<0) {
				this.transportes.remove(this.transporte);
			}
		}			
	}
	
	public void setEstadosInicialesTransporte(List<Transporte> transportesAux) throws Exception {
		TransporteConstantesFunciones.setEstadosInicialesTransporte(transportesAux);
	}
	
	public void setEstadosInicialesTransporte(Transporte transporteAux) throws Exception {
		TransporteConstantesFunciones.setEstadosInicialesTransporte(transporteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTransporteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTransporteActual()) {
				if(!this.isEsNuevoTransporte) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTransporte=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTransporteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Transporte ?", "MANTENIMIENTO DE Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Transporte transporte) throws Exception {
		TransporteConstantesFunciones.seleccionarAsignar(this.transporte,transporte);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTransporte=this.isPermisoActualizarOriginalTransporte;
			
			
			this.seleccionarAsignar(transporte);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransporteConstantesFunciones.quitarEspaciosTransporte(this.transporte,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.transporteSessionBean.setsFuncionBusquedaRapida(this.transporteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTransporte) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTransporte(esParaCancelar);				
				this.cancelarNuevoTransporte(esParaCancelar);								
			}
			
			this.transporte=new Transporte();
			
			this.inicializarTransporte();
			
			this.actualizarEstadoCeldasBotonesTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTransporte() throws Exception {
		try {
			TransporteConstantesFunciones.inicializarTransporte(this.transporte);
			
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
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.transporteLogic.getTransportes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTransportes(String sAccionBusqueda,List<Transporte> transportesParaReportes) throws Exception {
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
					sPathReporteFinal="Transporte"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TransporteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TransporteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Transporte"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Transportes");		
		parameters.put("busquedapor", TransporteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTransporte=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TransporteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TransporteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTransporte=new JRBeanArrayDataSource(TransporteJInternalFrame.TraerTransporteBeans(transportesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTransporte);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TransporteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TransporteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TransporteBean.TraerTransporteBeans(transportesParaReportes).toArray()));
							
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
				this.generarExcelReporteTransportes(sAccionBusqueda,sTipoArchivoReporte,transportesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTransportes(sAccionBusqueda,sTipoArchivoReporte,transportesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTransporteActionPerformed(null);
					//this.generarExcelReporteTransportes(sAccionBusqueda,sTipoArchivoReporte,transportesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTransportes(sAccionBusqueda,sTipoArchivoReporte,transportesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTransportes(sAccionBusqueda,sTipoArchivoReporte,transportesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTransportes(sAccionBusqueda,sTipoArchivoReporte,transportesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<Transporte> transportesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transporte";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transportes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransporte("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Transporte transporte : transportesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TransporteConstantesFunciones.generarExcelReporteDataTransporte("NORMAL",row,workbook,transporte,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTransporte(String sTipo,Row row,Workbook workbook) {
		
		TransporteConstantesFunciones.generarExcelReporteHeaderTransporte(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<Transporte> transportesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transporte_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transportes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Transporte transporte : transportesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TransporteConstantesFunciones.getTransporteDescripcion(transporte));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransporteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransporteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transporte.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transporte.gettipoviatransporte_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransporteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransporteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transporte.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransporteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransporteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transporte.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<Transporte> transportesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Transporte> transportesRespaldo=null;
		
		classes=TransporteConstantesFunciones.getClassesRelationshipsOfTransporte(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.transporteLogic.setDatosCliente(this.datosCliente);
		this.transporteLogic.setDatosDeep(this.datosDeep);
		this.transporteLogic.setIsConDeep(true);
		
		transportesRespaldo=this.transporteLogic.getTransportes();
		
		this.transporteLogic.setTransportes(transportesParaReportes);	
		this.transporteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		transportesParaReportes=this.transporteLogic.getTransportes();
		this.transporteLogic.setTransportes(transportesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transporte_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transportes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransporte("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Transporte transporte : transportesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTransporte("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TransporteConstantesFunciones.generarExcelReporteDataTransporte("NORMAL",row,workbook,transporte,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TransporteConstantesFunciones.getTransporteDescripcion(transporte));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransporte.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransporte.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTransporte() throws Exception {		
		this.startProcessTransporte(true);
	}
	
	public void startProcessTransporte(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTransporte ,this.jPanelParametrosReportesTransporte, this.jScrollPanelDatosTransporte,this.jPanelPaginacionTransporte, this.jScrollPanelDatosEdicionTransporte, this.jPanelAccionesTransporte,this.jPanelAccionesFormularioTransporte,this.jmenuBarTransporte,this.jmenuBarDetalleTransporte,this.jTtoolBarTransporte,this.jTtoolBarDetalleTransporte);		
		
		final JTabbedPane jTabbedPaneBusquedasTransporte=this.jTabbedPaneBusquedasTransporte; 
		
		final JPanel jPanelParametrosReportesTransporte=this.jPanelParametrosReportesTransporte;
		//final JScrollPane jScrollPanelDatosTransporte=this.jScrollPanelDatosTransporte;
		final JTable jTableDatosTransporte=this.jTableDatosTransporte;		
		final JPanel jPanelPaginacionTransporte=this.jPanelPaginacionTransporte;
		//final JScrollPane jScrollPanelDatosEdicionTransporte=this.jScrollPanelDatosEdicionTransporte;
		final JPanel jPanelAccionesTransporte=this.jPanelAccionesTransporte;
		
		JPanel jPanelCamposAuxiliarTransporte=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTransporte=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTransporte!=null) {
			jPanelCamposAuxiliarTransporte=this.jInternalFrameDetalleFormTransporte.jPanelCamposTransporte;
			jPanelAccionesFormularioAuxiliarTransporte=this.jInternalFrameDetalleFormTransporte.jPanelAccionesFormularioTransporte;
		}
		
		final JPanel jPanelCamposTransporte=jPanelCamposAuxiliarTransporte;
		final JPanel jPanelAccionesFormularioTransporte=jPanelAccionesFormularioAuxiliarTransporte;
		
		
		final JMenuBar jmenuBarTransporte=this.jmenuBarTransporte;
		final JToolBar jTtoolBarTransporte=this.jTtoolBarTransporte;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTransporte=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransporte=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) {
			jmenuBarDetalleAuxiliarTransporte=this.jInternalFrameDetalleFormTransporte.jmenuBarDetalleTransporte;
			jTtoolBarDetalleAuxiliarTransporte=this.jInternalFrameDetalleFormTransporte.jTtoolBarDetalleTransporte;
		}
		
		final JMenuBar jmenuBarDetalleTransporte=jmenuBarDetalleAuxiliarTransporte;
		final JToolBar jTtoolBarDetalleTransporte=jTtoolBarDetalleAuxiliarTransporte;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransporte;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransporte;
			processRunnable.jTableDatos=jTableDatosTransporte;
			processRunnable.jPanelCampos=jPanelCamposTransporte;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransporte;
			processRunnable.jPanelAcciones=jPanelAccionesTransporte;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransporte;
			
			
			processRunnable.jmenuBar=jmenuBarTransporte;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransporte;
			processRunnable.jTtoolBar=jTtoolBarTransporte;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransporte;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransporte ,jPanelParametrosReportesTransporte,jTableDatosTransporte, /*jScrollPanelDatosTransporte,*/jPanelCamposTransporte,jPanelPaginacionTransporte, /*jScrollPanelDatosEdicionTransporte,*/ jPanelAccionesTransporte,jPanelAccionesFormularioTransporte,jmenuBarTransporte,jmenuBarDetalleTransporte,jTtoolBarTransporte,jTtoolBarDetalleTransporte);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransporte ,jPanelParametrosReportesTransporte, jScrollPanelDatosTransporte,jPanelPaginacionTransporte, jScrollPanelDatosEdicionTransporte, jPanelAccionesTransporte,jPanelAccionesFormularioTransporte,jmenuBarTransporte,jmenuBarDetalleTransporte,jTtoolBarTransporte,jTtoolBarDetalleTransporte);
						
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
	
	public void finishProcessTransporte() {// throws Exception 
		this.finishProcessTransporte(true);
	}
	
	public void finishProcessTransporte(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTransporte ,this.jPanelParametrosReportesTransporte, this.jScrollPanelDatosTransporte,this.jPanelPaginacionTransporte, this.jScrollPanelDatosEdicionTransporte, this.jPanelAccionesTransporte,this.jPanelAccionesFormularioTransporte,this.jmenuBarTransporte,this.jmenuBarDetalleTransporte,this.jTtoolBarTransporte,this.jTtoolBarDetalleTransporte);		
		
		final JTabbedPane jTabbedPaneBusquedasTransporte=this.jTabbedPaneBusquedasTransporte; 
		
		final JPanel jPanelParametrosReportesTransporte=this.jPanelParametrosReportesTransporte;
		//final JScrollPane jScrollPanelDatosTransporte=this.jScrollPanelDatosTransporte;
		final JTable jTableDatosTransporte=this.jTableDatosTransporte;		
		final JPanel jPanelPaginacionTransporte=this.jPanelPaginacionTransporte;
		//final JScrollPane jScrollPanelDatosEdicionTransporte=this.jScrollPanelDatosEdicionTransporte;
		final JPanel jPanelAccionesTransporte=this.jPanelAccionesTransporte;
		
		JPanel jPanelCamposAuxiliarTransporte=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTransporte=new JPanel();
		
		if(this.jInternalFrameDetalleFormTransporte!=null) {
			jPanelCamposAuxiliarTransporte=this.jInternalFrameDetalleFormTransporte.jPanelCamposTransporte;
			jPanelAccionesFormularioAuxiliarTransporte=this.jInternalFrameDetalleFormTransporte.jPanelAccionesFormularioTransporte;
		}
		
		final JPanel jPanelCamposTransporte=jPanelCamposAuxiliarTransporte;
		final JPanel jPanelAccionesFormularioTransporte=jPanelAccionesFormularioAuxiliarTransporte;
		
		
		final JMenuBar jmenuBarTransporte=this.jmenuBarTransporte;		
		final JToolBar jTtoolBarTransporte=this.jTtoolBarTransporte;
				
		JMenuBar jmenuBarDetalleAuxiliarTransporte=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransporte=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTransporte!=null) {
			jmenuBarDetalleAuxiliarTransporte=this.jInternalFrameDetalleFormTransporte.jmenuBarDetalleTransporte;
			jTtoolBarDetalleAuxiliarTransporte=this.jInternalFrameDetalleFormTransporte.jTtoolBarDetalleTransporte;		
		}
		
		final JMenuBar jmenuBarDetalleTransporte=jmenuBarDetalleAuxiliarTransporte;
		final JToolBar jTtoolBarDetalleTransporte=jTtoolBarDetalleAuxiliarTransporte;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransporte;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransporte;
			processRunnable.jTableDatos=jTableDatosTransporte;
			processRunnable.jPanelCampos=jPanelCamposTransporte;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransporte;
			processRunnable.jPanelAcciones=jPanelAccionesTransporte;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransporte;
			
			
			processRunnable.jmenuBar=jmenuBarTransporte;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransporte;
			processRunnable.jTtoolBar=jTtoolBarTransporte;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransporte;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTransporte ,jPanelParametrosReportesTransporte, jTableDatosTransporte,/*jScrollPanelDatosTransporte,*/jPanelCamposTransporte,jPanelPaginacionTransporte, /*jScrollPanelDatosEdicionTransporte,*/ jPanelAccionesTransporte,jPanelAccionesFormularioTransporte,jmenuBarTransporte,jmenuBarDetalleTransporte,jTtoolBarTransporte,jTtoolBarDetalleTransporte));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTransporte(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTransporte(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTransporte(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTransporte(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTransporte,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTransporte,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTransporte(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTransporte,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTransporte,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.transporteConstantesFunciones.getsFinalQueryTransporte();
		String  finalQueryPaginacionTodos=this.transporteConstantesFunciones.getsFinalQueryTransporte();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TransporteConstantesFunciones.getArrayColumnasGlobalesNoTransporte(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TransporteConstantesFunciones.getArrayColumnasGlobalesTransporte(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TransporteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.transportesEliminados= new ArrayList<Transporte>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTransporte();
		
				///*TransporteSessionBean*/this.transporteSessionBean=new TransporteSessionBean();
			
			if(this.transporteSessionBean==null) {
				this.transporteSessionBean=new TransporteSessionBean();
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
					this.iNumeroPaginacion=TransporteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TransporteConstantesFunciones.getClassesForeignKeysOfTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/transporte."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			transportesAux= new ArrayList<Transporte>();
			
				
			transporteLogic.setDatosCliente(this.datosCliente);
			transporteLogic.setDatosDeep(this.datosDeep);
			transporteLogic.setIsConDeep(true);
			
			
			transporteLogic.getTransporteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					transporteLogic.getTodosTransportes(finalQueryGlobal,pagination);
					
					//transporteLogic.getTodosTransportesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(transporteLogic.getTransportes()==null|| transporteLogic.getTransportes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transportesAux= new ArrayList<Transporte>();
							transportesAux.addAll(transporteLogic.getTransportes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportesAux= new ArrayList<Transporte>();
							transportesAux.addAll(transportes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transporteLogic.getTodosTransportes(finalQueryGlobal+"",this.pagination);												
							
							//transporteLogic.getTodosTransportesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTransportes("Todos",transporteLogic.getTransportes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transporteLogic.setTransportes(new ArrayList<Transporte>());					
							transporteLogic.getTransportes().addAll(transportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportes=new ArrayList<Transporte>();
							transportes.addAll(transportesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTransporte=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTransporte=this.idActual;
				
				} else if(this.idTransporteActual!=null && this.idTransporteActual!=0L) {
					idTransporte=idTransporteActual;
				}
				
					
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndicePorId(idTransporte);
				
				this.transportes=new ArrayList<Transporte>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					transporteLogic.getEntity(idTransporte);
					
					//transporteLogic.getEntityWithConnection(idTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transporteLogic.setTransportes(new ArrayList<Transporte>());
					transporteLogic.getTransportes().add(transporteLogic.getTransporte());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transportes=new ArrayList<Transporte>();
					this.transportes.add(transporte);
				}
				
				if(transporteLogic.getTransporte()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transporteLogic.getTransportesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transporteLogic.getTransportes()==null||transporteLogic.getTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportes==null|| transportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportesAux=new ArrayList<Transporte>();
						transportesAux.addAll(transporteLogic.getTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportesAux=new ArrayList<Transporte>();
							transportesAux.addAll(transportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transporteLogic.getTransportesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportes("BusquedaPorCodigo",transporteLogic.getTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportes("BusquedaPorCodigo",transportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transporteLogic.setTransportes(new ArrayList<Transporte>());
						transporteLogic.getTransportes().addAll(transportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportes=new ArrayList<Transporte>();
							transportes.addAll(transportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transporteLogic.getTransportesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transporteLogic.getTransportes()==null||transporteLogic.getTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportes==null|| transportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportesAux=new ArrayList<Transporte>();
						transportesAux.addAll(transporteLogic.getTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportesAux=new ArrayList<Transporte>();
							transportesAux.addAll(transportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transporteLogic.getTransportesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportes("BusquedaPorNombre",transporteLogic.getTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportes("BusquedaPorNombre",transportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transporteLogic.setTransportes(new ArrayList<Transporte>());
						transporteLogic.getTransportes().addAll(transportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportes=new ArrayList<Transporte>();
							transportes.addAll(transportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transporteLogic.getTransportesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transporteLogic.getTransportes()==null||transporteLogic.getTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportes==null|| transportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportesAux=new ArrayList<Transporte>();
						transportesAux.addAll(transporteLogic.getTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportesAux=new ArrayList<Transporte>();
							transportesAux.addAll(transportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transporteLogic.getTransportesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportes("FK_IdEmpresa",transporteLogic.getTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportes("FK_IdEmpresa",transportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transporteLogic.setTransportes(new ArrayList<Transporte>());
						transporteLogic.getTransportes().addAll(transportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportes=new ArrayList<Transporte>();
							transportes.addAll(transportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoViaTransporte")) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transporteLogic.getTransportesFK_IdTipoViaTransporte(finalQueryGlobal,pagination,id_tipo_via_transporteFK_IdTipoViaTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transporteLogic.getTransportes()==null||transporteLogic.getTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportes==null|| transportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportesAux=new ArrayList<Transporte>();
						transportesAux.addAll(transporteLogic.getTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportesAux=new ArrayList<Transporte>();
							transportesAux.addAll(transportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transporteLogic.getTransportesFK_IdTipoViaTransporte(finalQueryGlobal,pagination,id_tipo_via_transporteFK_IdTipoViaTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransporteConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportes("FK_IdTipoViaTransporte",transporteLogic.getTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportes("FK_IdTipoViaTransporte",transportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transporteLogic.setTransportes(new ArrayList<Transporte>());
						transporteLogic.getTransportes().addAll(transportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportes=new ArrayList<Transporte>();
							transportes.addAll(transportesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTransporte();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTransporte();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transporteLogic.getTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transportes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transporteLogic.getTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transportes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Transporte transporte) {
		Boolean permite=true;
		
		if(this.transporte.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TransporteConstantesFunciones.getOrderByListaTransporte();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TransporteConstantesFunciones.getOrderByListaTransporte();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transporte transporte:transporteLogic.getTransportes()) {
				if(transporte.getsType().equals(Constantes2.S_TOTALES)) {
					transporteTotales=transporte;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transporte transporte:this.transportes) {
				if(transporte.getsType().equals(Constantes2.S_TOTALES)) {
					transporteTotales=transporte;
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
			this.transporteAux=new Transporte();
			this.transporteAux.setsType(Constantes2.S_TOTALES);
			this.transporteAux.setIsNew(false);
			this.transporteAux.setIsChanged(false);
			this.transporteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TransporteConstantesFunciones.TotalizarValoresFilaTransporte(this.transporteLogic.getTransportes(),this.transporteAux);
				
				this.transporteLogic.getTransportes().add(this.transporteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TransporteConstantesFunciones.TotalizarValoresFilaTransporte(this.transportes,this.transporteAux);
				
				this.transportes.add(this.transporteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		transporteTotales=new Transporte();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transporteLogic.getTransportes().remove(transporteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transportes.remove(transporteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		transporteTotales=new Transporte();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transporte transporte:transporteLogic.getTransportes()) {
				if(transporte.getsType().equals(Constantes2.S_TOTALES)) {
					transporteTotales=transporte;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransporteConstantesFunciones.TotalizarValoresFilaTransporte(this.transporteLogic.getTransportes(),transporteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transporte transporte:this.transportes) {
				if(transporte.getsType().equals(Constantes2.S_TOTALES)) {
					transporteTotales=transporte;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransporteConstantesFunciones.TotalizarValoresFilaTransporte(this.transportes,transporteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTransportesBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransportesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransportesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransportesFK_IdTipoViaTransporte()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoViaTransporte";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTransportesBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transporteLogic.getTransportesBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransportesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transporteLogic.getTransportesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransportesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transporteLogic.getTransportesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransportesFK_IdTipoViaTransporte(String sFinalQuery,Long id_tipo_via_transporte)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transporteLogic.getTransportesFK_IdTipoViaTransporte(sFinalQuery,this.pagination,id_tipo_via_transporte);
				
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
	
	public void inicializarPermisosTransporte() {
		this.isPermisoTodoTransporte=false;
		this.isPermisoNuevoTransporte=false;
		this.isPermisoActualizarTransporte=false;
		this.isPermisoActualizarOriginalTransporte=false;
		this.isPermisoEliminarTransporte=false;
		this.isPermisoGuardarCambiosTransporte=false;
		this.isPermisoConsultaTransporte=false;
		this.isPermisoBusquedaTransporte=false;
		this.isPermisoReporteTransporte=false;		
		this.isPermisoOrdenTransporte=false;		
		this.isPermisoPaginacionMedioTransporte=false;		
		this.isPermisoPaginacionAltoTransporte=false;
		this.isPermisoPaginacionTodoTransporte=false;
		this.isPermisoCopiarTransporte=false;		
		this.isPermisoVerFormTransporte=false;		
		this.isPermisoDuplicarTransporte=false;		
		this.isPermisoOrdenTransporte=false;		
	}
	
	public void setPermisosUsuarioTransporte(Boolean isPermiso) {
		this.isPermisoTodoTransporte=isPermiso;
		this.isPermisoNuevoTransporte=isPermiso;
		this.isPermisoActualizarTransporte=isPermiso;
		this.isPermisoActualizarOriginalTransporte=isPermiso;
		this.isPermisoEliminarTransporte=isPermiso;
		this.isPermisoGuardarCambiosTransporte=isPermiso;
		this.isPermisoConsultaTransporte=isPermiso;
		this.isPermisoBusquedaTransporte=isPermiso;
		this.isPermisoReporteTransporte=isPermiso;
		this.isPermisoOrdenTransporte=isPermiso;		
		this.isPermisoPaginacionMedioTransporte=isPermiso;		
		this.isPermisoPaginacionAltoTransporte=isPermiso;		
		this.isPermisoPaginacionTodoTransporte=isPermiso;		
		this.isPermisoCopiarTransporte=isPermiso;		
		this.isPermisoVerFormTransporte=isPermiso;		
		this.isPermisoDuplicarTransporte=isPermiso;
		this.isPermisoOrdenTransporte=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTransporte(Boolean isPermiso) {
		//this.isPermisoTodoTransporte=isPermiso;
		this.isPermisoNuevoTransporte=isPermiso;
		this.isPermisoActualizarTransporte=isPermiso;
		this.isPermisoActualizarOriginalTransporte=isPermiso;
		this.isPermisoEliminarTransporte=isPermiso;
		this.isPermisoGuardarCambiosTransporte=isPermiso;
		//this.isPermisoConsultaTransporte=isPermiso;
		//this.isPermisoBusquedaTransporte=isPermiso;
		//this.isPermisoReporteTransporte=isPermiso;
		//this.isPermisoOrdenTransporte=isPermiso;		
		//this.isPermisoPaginacionMedioTransporte=isPermiso;		
		//this.isPermisoPaginacionAltoTransporte=isPermiso;		
		//this.isPermisoPaginacionTodoTransporte=isPermiso;		
		//this.isPermisoCopiarTransporte=isPermiso;		
		//this.isPermisoDuplicarTransporte=isPermiso;
		//this.isPermisoOrdenTransporte=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTransporteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTransporte(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTransporteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTransporteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTransporteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTransporteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTransporte() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.transporteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TransporteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTransporte=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTransporte=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTransporte=this.isPermisoActualizarTransporte;
			this.isPermisoEliminarTransporte=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTransporte=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTransporte=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTransporte=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTransporte=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTransporte=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransporte=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTransporte=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTransporte=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTransporte=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTransporte=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTransporte=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTransporte=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransporte=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.transporteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTransporte.setToolTipText(this.jTableDatosTransporte.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTransporte(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTransporte(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTransporte() throws Exception {
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
	public void inicializarCombosForeignKeyTransporteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoviatransportesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTransporteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TransporteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTransporteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoViaTransporteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoViaTransporteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoviatransportesForeignKey==null||this.tipoviatransportesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoViaTransporteConstantesFunciones.getArrayColumnasGlobalesTipoViaTransporte(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoViaTransporteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoViaTransporteConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoViaTransportesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTransporteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TransporteParameterReturnGeneral transporteReturnGeneral=new TransporteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.transporteConstantesFunciones.cargarid_empresaTransporte)
					 || (this.esRecargarFks && this.transporteConstantesFunciones.cargarid_empresaTransporte)) {

					if(!this.transporteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+transporteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoViaTransporte="";

				if(((this.tipoviatransportesForeignKey==null||this.tipoviatransportesForeignKey.size()<=0) && this.transporteConstantesFunciones.cargarid_tipo_via_transporteTransporte)
					 || (this.esRecargarFks && this.transporteConstantesFunciones.cargarid_tipo_via_transporteTransporte)) {

					if(!this.transporteSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoViaTransporteConstantesFunciones.getArrayColumnasGlobalesTipoViaTransporte(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoViaTransporte=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoViaTransporteConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoViaTransporte=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoViaTransporte, "");
						finalQueryGlobalTipoViaTransporte+=TipoViaTransporteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoViaTransportesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoViaTransporte=" WHERE " + ConstantesSql.ID + "="+transporteSessionBean.getlidTipoViaTransporteActual();
					}
				} else {
					finalQueryGlobalTipoViaTransporte="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				transporteReturnGeneral=transporteLogic.cargarCombosLoteForeignKeyTransporte(finalQueryGlobalEmpresa,finalQueryGlobalTipoViaTransporte);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=transporteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoViaTransporte.equals("NONE")) {
				this.tipoviatransportesForeignKey=transporteReturnGeneral.gettipoviatransportesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTransporte()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoViaTransporte();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.transporteSessionBean==null) {
				this.transporteSessionBean=new TransporteSessionBean();
			}

			if(!this.transporteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoViaTransporte()throws Exception {
		try {

			if(!this.transporteSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {
				TipoViaTransporte tipoviatransporte=new TipoViaTransporte();
				TipoViaTransporteConstantesFunciones.setTipoViaTransporteDescripcion(tipoviatransporte,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoviatransporte.setId(null);

				if(!TipoViaTransporteConstantesFunciones.ExisteEnLista(this.tipoviatransportesForeignKey,tipoviatransporte,true)) {

					this.tipoviatransportesForeignKey.add(0,tipoviatransporte);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTransporte()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTransporte(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTransporte()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransporte();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTransporte(Transporte transporte)throws Exception {	
		try {
			
			this.setActualTipoViaTransporteForeignKey(transporte.getid_tipo_via_transporte(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTransporte(Transporte transporte,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTransporte()throws Exception {	
		try {
			
			this.setActualTipoViaTransporteForeignKey(this.transporteConstantesFunciones.getid_tipo_via_transporte(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTransporte()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTransporte()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTransporte()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTransporte()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTransporte()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoViaTransportesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTransporte(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoViaTransportesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTransporte()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte!=null && this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte!=null && this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public TransporteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TransporteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TransporteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.transporteSessionBean=new TransporteSessionBean(); 
		this.transporteConstantesFunciones=new TransporteConstantesFunciones(); 
		this.transporteBean=new Transporte();//(this.transporteConstantesFunciones); 		
		this.transporteReturnGeneral=new TransporteParameterReturnGeneral(); 
		
		this.transporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTransporte(true);
			
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
			
			this.transporteConstantesFunciones=new TransporteConstantesFunciones(); 
			this.transporteBean=new Transporte();//this.transporteConstantesFunciones); 			
			this.transporteReturnGeneral=new TransporteParameterReturnGeneral(); 
		
			TransporteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transporte Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.transporte=new Transporte();
			this.transportes = new ArrayList<Transporte>();
			this.transportesAux = new ArrayList<Transporte>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic=new TransporteLogic();
				this.transporteLogic.getNewConnexionToDeep("");
			}
			
			//this.transporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.transporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTransporte);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransporte);	
					}
					
					if(this.jInternalFrameImportacionTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransporte);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTransporte);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTransporte!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTransporte);
				this.jInternalFrameDetalleFormTransporte.setVisible(false);
				this.jInternalFrameDetalleFormTransporte.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransporte);
					this.jInternalFrameReporteDinamicoTransporte.setVisible(false);
					this.jInternalFrameReporteDinamicoTransporte.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTransporte);
					this.jInternalFrameImportacionTransporte.setVisible(false);
					this.jInternalFrameImportacionTransporte.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTransporte);
					this.jInternalFrameOrderByTransporte.setVisible(false);
					this.jInternalFrameOrderByTransporte.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTransporteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TransporteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.transporteReturnGeneral=new TransporteParameterReturnGeneral();
			
			this.transporteParameterGeneral=new TransporteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.transporteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.transporteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransporteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transporteSessionBean.getEsGuardarRelacionado(),this.transporteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransporteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transporteSessionBean.getEsGuardarRelacionado(),this.transporteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTransporte=false;
			this.isVisibilidadCeldaDuplicarTransporte=true;
			this.isVisibilidadCeldaCopiarTransporte=true;
			this.isVisibilidadCeldaVerFormTransporte=true;
			this.isVisibilidadCeldaOrdenTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesTransporte=false;
			this.isVisibilidadCeldaModificarTransporte=false;
			this.isVisibilidadCeldaActualizarTransporte=false;
			this.isVisibilidadCeldaEliminarTransporte=false;
			this.isVisibilidadCeldaCancelarTransporte=false;
			this.isVisibilidadCeldaGuardarTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTransporte=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoViaTransporte=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTransporte();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTransporte(false);
			
			this.setPermisosUsuarioTransporte();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transporteSessionBean.getEsGuardarRelacionado() 
				|| (this.transporteSessionBean.getEsGuardarRelacionado() && this.transporteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTransporteClasesRelacionadas();
			}
			
			if(this.transporteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTransporteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TransporteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTransporte();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTransporte();
			}
			
			if(!this.isPermisoBusquedaTransporte) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTransporte.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transporteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTransporte,this.isPermisoPaginacionMedioTransporte,this.isPermisoPaginacionTodoTransporte);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TransporteConstantesFunciones.getTiposSeleccionarTransporte());
				
				this.tiposColumnasSelect=TransporteConstantesFunciones.getTiposSeleccionarTransporte(true);
				
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
			//if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTransporte();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTransporte(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTransporte(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTransporte() ;
			
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
			this.tipoviatransporteLogic=new TipoViaTransporteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				transporteImplementable= (TransporteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransporteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				transporteImplementableHome= (TransporteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransporteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.transportes= new ArrayList<Transporte>();
			this.transportesEliminados= new ArrayList<Transporte>();
						
			this.isEsNuevoTransporte=false;
			this.esParaAccionDesdeFormularioTransporte=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoviatransportesForeignKey=new ArrayList<TipoViaTransporte>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTransporte(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTransporte();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TransporteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TransporteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTransporte(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTransporte!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTransporte();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTransporte();
			}
			
			TransporteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTransporte.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTransporte.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTransporte.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTransporte(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Transporte: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTransporte() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTransporte")) {
				iIndex=this.jInternalFrameDetalleFormTransporte.jTabbedPaneRelacionesTransporte.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTransporte.jTabbedPaneRelacionesTransporte.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTransporte.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTransporte();	
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
	
	public void cargarCombosForeignKeyTransporte(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTransporte(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTransporte(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTransporteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTransporte();
		
		this.cargarCombosFrameForeignKeyTransporte();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTransporte();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTransporte();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoViaTransporte(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoViaTransporteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoViaTransporte();
				this.cargarCombosFrameTipoViaTransportesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoViaTransporte(this.tipoviatransportesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTransporteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.transporteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
			
			if(jTableDatosTransporte.getRowCount()>=1) {
				jTableDatosTransporte.removeRowSelectionInterval(0, jTableDatosTransporte.getRowCount()-1);						
			}
			
			this.isEsNuevoTransporte=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTransporte(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTransporte(true);			
			//this.transporte=new Transporte();
			//this.transporte.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransporte(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransporte() ;
			
			if(TransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransporte(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.transporte);	
			this.actualizarInformacion("INFO_PADRE",false,this.transporte);				
			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
			if(this.transporteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Transporte: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTransporteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTransporte.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTransporte.getSelectedRows().length;			
			}
			
			transportesSeleccionados=this.getTransportesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTransporte--;			
				//Transporte transporteAux= new Transporte();			
				//transporteAux.setId(this.iIdNuevoTransporte);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Transporte transporteOrigen=new Transporte();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Transporte transporteOrigen : transportesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							transporteOrigen =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transporteOrigen =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTransporte();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.transporte.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTransporte(transporteOrigen,this.transporte,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transporteLogic.getTransportes().add(this.transporteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transportes.add(this.transporteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTransporte(false);
				
				this.jTableDatosTransporte.setRowSelectionInterval(this.getIndiceNuevoTransporte(), this.getIndiceNuevoTransporte());
				
				int iLastRow =  this.jTableDatosTransporte.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransporte.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransporte.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransporte(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();									
		
			Transporte transporteOrigen=new Transporte();
			Transporte transporteDestino=new Transporte();
				
			transportesSeleccionados=this.getTransportesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTransporte.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || transportesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTransporte.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transporteOrigen =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transporteOrigen =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transporteDestino =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transporteDestino =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				transporteOrigen =transportesSeleccionados.get(0);
				transporteDestino =transportesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTransporte(transporteOrigen,transporteDestino,true,false);
				
				transporteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transporteDestino,transporteLogic.getTransportes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transporteDestino,transportes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTransporte(false);
				
				//this.jTableDatosTransporte.setRowSelectionInterval(this.getIndiceNuevoTransporte(), this.getIndiceNuevoTransporte());
				
				int iLastRow =  this.jTableDatosTransporte.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransporte.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransporte.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransporte(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTransporte.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTransporte.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTransporte.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTransporte.setVisible(!isVisible);
			this.jPanelPaginacionTransporte.setVisible(!isVisible);
			this.jPanelAccionesTransporte.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTransporte();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTransporte();
			
			this.abrirFrameOrderByTransporte();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTransporte(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransporte);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTransporte.isMaximum()) {
					this.jInternalFrameDetalleFormTransporte.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTransporte.setSize(this.jInternalFrameDetalleFormTransporte.iWidthFormulario,this.jInternalFrameDetalleFormTransporte.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTransporte.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTransporte.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTransporte.isMaximum()) {
						this.jInternalFrameDetalleFormTransporte.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTransporte.jContentPaneDetalleTransporte.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTransporte.jTabbedPaneRelacionesTransporte.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTransporte.jContentPaneDetalleTransporte.getWidth(),TransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransporte.jTabbedPaneRelacionesTransporte.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTransporte.jContentPaneDetalleTransporte.getWidth(),TransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransporte.jTabbedPaneRelacionesTransporte.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTransporte.jContentPaneDetalleTransporte.getWidth(),TransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTransporte.setVisible(true);
	        this.jInternalFrameDetalleFormTransporte.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTransporte() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTransporte==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransporte,false,this);
				} else {
					this.jInternalFrameOrderByTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransporte,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTransporte);
				this.jInternalFrameOrderByTransporte.setVisible(false);
				this.jInternalFrameOrderByTransporte.setSelected(false);
				
				this.jInternalFrameOrderByTransporte.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransporte"));
				
				this.inicializarActualizarBindingTablaOrderByTransporte();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTransporte() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTransporte==null) {
				
				this.jInternalFrameImportacionTransporte=new ImportacionJInternalFrame(TransporteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransporte);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTransporte);
				this.jInternalFrameImportacionTransporte.setVisible(false);
				this.jInternalFrameImportacionTransporte.setSelected(false);


				this.jInternalFrameImportacionTransporte.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransporte"));
				this.jInternalFrameImportacionTransporte.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransporte"));
				this.jInternalFrameImportacionTransporte.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransporte"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTransporte() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTransporte==null) {
				this.jInternalFrameReporteDinamicoTransporte=new ReporteDinamicoJInternalFrame(TransporteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransporte);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransporte);
				this.jInternalFrameReporteDinamicoTransporte.setVisible(false);
				this.jInternalFrameReporteDinamicoTransporte.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTransporte.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransporte"));
				this.jInternalFrameReporteDinamicoTransporte.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransporte"));
				this.jInternalFrameReporteDinamicoTransporte.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransporte"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransporte();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTransporte() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransporte);
			
	       	this.jInternalFrameDetalleFormTransporte.setVisible(false);
	        this.jInternalFrameDetalleFormTransporte.setSelected(false);
			
			//this.jInternalFrameDetalleFormTransporte.dispose();
			//this.jInternalFrameDetalleFormTransporte=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTransporte() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTransporte.setVisible(true);
	        this.jInternalFrameReporteDinamicoTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTransporte() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTransporte.setVisible(true);
	        this.jInternalFrameImportacionTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTransporte() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTransporte.setVisible(true);
	        this.jInternalFrameOrderByTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTransporte() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTransporte.setVisible(false);
	        this.jInternalFrameOrderByTransporte.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTransporte() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTransporte.setVisible(false);
	        this.jInternalFrameReporteDinamicoTransporte.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTransporte() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTransporte.setVisible(false);
	        this.jInternalFrameImportacionTransporte.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTransporte(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTransporte(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTransporte(true);
			//this.isEsNuevoTransporte=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransporte(false) ;
			
			if(transporteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransporte(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransporte(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTransporteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTransporte(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTransporte(true);
			//this.isEsNuevoTransporte=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.transporte.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTransporte(false) ;
			
			if(TransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransporte(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransporte(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoViaTransporte(List<TipoViaTransporte> tipoviatransportesForeignKey)throws Exception{
		TableColumn tableColumnTipoViaTransporte=this.jTableDatosTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransporte,TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE));
		TableCellEditor tableCellEditorTipoViaTransporte =tableColumnTipoViaTransporte.getCellEditor();

		TipoViaTransporteTableCell tipoviatransporteTableCellFk=(TipoViaTransporteTableCell)tableCellEditorTipoViaTransporte;

		if(tipoviatransporteTableCellFk!=null) {
			tipoviatransporteTableCellFk.settipoviatransportesForeignKey(tipoviatransportesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransporte.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoviatransporteTableCellFk.setRowActual(intSelectedRow);
			//tipoviatransporteTableCellFk.settipoviatransportesForeignKeyActual(tipoviatransportesForeignKey);
		//}


		if(tipoviatransporteTableCellFk!=null) {
			tipoviatransporteTableCellFk.RecargarTipoViaTransportesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTransporte(false);
			
			//if(!this.isEsNuevoTransporte) {								
				int intSelectedRow = this.jTableDatosTransporte.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTransporte(this.transporte,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
				
			}
			
			if(this.permiteMantenimiento(this.transporte)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.transporteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTransporte=true;
					this.inicializarActualizarBindingTablaTransporte(false);
					this.isEsNuevoTransporte=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTransporte=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTransporte=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransporte(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransporte(false);
				
				this.habilitarDeshabilitarControlesTransporte(false);
			
												
				
				if(TransporteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTransporte();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTransporteActionPerformed(evt,transporteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTransporte(this.transporte,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTransporte.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,transporteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.transporte.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Transporte.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transporte.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTransporte.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				this.transporte.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				this.transporte.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.transporte)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.transporteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TransporteModel) this.jTableDatosTransporte.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTransporte=true;
				this.inicializarActualizarBindingTablaTransporte(false);
				this.isEsNuevoTransporte=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransporte(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransporte(false);
				
				this.habilitarDeshabilitarControlesTransporte(false);
				
				
				
				if(TransporteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTransporte();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTransporteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTransporte.getRowCount()>=1) {
				jTableDatosTransporte.removeRowSelectionInterval(0, jTableDatosTransporte.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTransporte(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTransporte(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransporte(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransporte(false) ;
			
			this.isEsNuevoTransporte=false;
			
			if(TransporteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTransporte();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTransporte(false);
				
				//SI ES MANUAL
				if(TransporteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTransporte();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTransporte--;			
			//Transporte transporteAux= new Transporte();			
			//transporteAux.setId(this.iIdNuevoTransporte);
			
			if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTransporte();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
			
			this.transporte.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.transporteLogic.getTransportes().add(this.transporteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.transportes.add(this.transporteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTransporte(false);
			
			this.jTableDatosTransporte.setRowSelectionInterval(this.getIndiceNuevoTransporte(), this.getIndiceNuevoTransporte());
			
			int iLastRow =  this.jTableDatosTransporte.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTransporte.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTransporte.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTransporte(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTransporte(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransporte(false);
			
			//SI ES MANUAL
			if(TransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransporte();
			}
			
			//this.abrirFrameTreeTransporte();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTransporteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE TransporteS ?", "MANTENIMIENTO DE Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTransporte.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTransporte();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.transporteReturnGeneral=transporteLogic.procesarImportacionTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.transporteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTransporteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTransporteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTransporte.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTransporte.setFileImportacion(this.jInternalFrameImportacionTransporte.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTransporte.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTransporte.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTransporte.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTransporte.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();		

		transportesSeleccionados=this.getTransportesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransporte.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransporte.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TransporteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TransporteBaseDesign.jrxml";
			
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
			
			this.generarReporteTransportes("Todos",transportesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransporteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoViaTransporte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoViaTransporte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoViaTransporte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoViaTransporte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransporteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransporteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTransporte.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTransporte.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTransporte.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TransporteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					sNombreCampoCategoria="id_tipo_via_transporte";
					break;

				case TransporteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TransporteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTransporte.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TransporteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					sNombreCampoCategoriaValor="id_tipo_via_transporte";
					break;

				case TransporteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TransporteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTransporte.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransporte.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransporteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Via Transporte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_via_transporte");
					break;

				case TransporteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TransporteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTransporteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();		
		
		transportesSeleccionados=this.getTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transporte";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Transportes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TransporteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransporteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Transporte transporte:transportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transporte.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
					iRow++;

					for(Transporte transporte:transportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transporte.gettipoviatransporte_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransporteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransporteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Transporte transporte:transportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transporte.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransporteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransporteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Transporte transporte:transportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transporte.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTransporte(row);				
			//	iRow++;
			//}				
			
			//for(Transporte transporteAux:transportesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTransporte(transporteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transporte",JOptionPane.INFORMATION_MESSAGE);
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
				this.transporteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransporte(false);
			
			//SI ES MANUAL
			if(TransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransporte();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransporte(false);
			
			//SI ES MANUAL
			if(TransporteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransporte();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransporte(false);
			
			//SI ES MANUAL
			if(TransporteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransporte();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTransporte() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTransporte.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTransporte.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTransporte.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTransporte.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTransporte.setMinimumSize(dimensionMinimum);
		this.jTableDatosTransporte.setMaximumSize(dimensionMaximum);
		this.jTableDatosTransporte.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTransporte(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTransporte(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTransporte(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTransporte(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTransporte(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTransporte(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransporte(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTransporte(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TransporteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TransporteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTransporte() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTransporte();
		
		this.inicializarActualizarBindingBotonesManualTransporte(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTransporte();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransporte() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTransporte(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTransporte(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTransporte.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTransporte.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTransporte.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTransporte!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTransporte.jCheckBoxPostAccionNuevoTransporte.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTransporte.jCheckBoxPostAccionSinCerrarTransporte.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTransporte.jCheckBoxPostAccionSinMensajeTransporte.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTransporte.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTransporte.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTransporte.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTransporte!=null) {
				this.jInternalFrameDetalleFormTransporte.jCheckBoxPostAccionNuevoTransporte.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTransporte.jCheckBoxPostAccionSinCerrarTransporte.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTransporte.jCheckBoxPostAccionSinMensajeTransporte.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTransporte.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTransporte.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTransporte!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTransporte.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTransporte!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransporte.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTransporte.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTransporte.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTransporte.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTransporte.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTransporte!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransporte.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTransporte.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTransporte.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTransporte(Boolean esInicializar) throws Exception {
		try	{	
			if(TransporteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTransporte(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTransporte() throws Exception {
		try	{
			if(TransporteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTransporte();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransporte() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTransporte() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTransporte.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTransporte.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTransporte.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTransporte.addItem(reporte);
			}
			
			
			if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTransporte.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTransporte.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTransporte.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTransporte.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTransporte.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTransporte.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransporte();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransporte() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransporte!=null) {
				this.jInternalFrameReporteDinamicoTransporte.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransporte.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransporte!=null) {
				this.jInternalFrameReporteDinamicoTransporte.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransporte.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTransporte!=null) {
				
				if(this.jInternalFrameReporteDinamicoTransporte.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransporte.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransporte.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTransporte.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransporte.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransporte.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTransporte()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTransporte.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTransporte.getText();
		if(this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.getSelectedItem()!=null){this.id_tipo_via_transporteFK_IdTipoViaTransporte=((TipoViaTransporte)this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTransporte(Boolean esInicializar) throws Exception {				
		if(TransporteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTransporte();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTransporte() throws Exception {
		this.inicializarActualizarBindingTablaTransporte(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTransporte() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TransportePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TransportePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTransporteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransporteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TransportePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TransportePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTransporte(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=transporteLogic.getTransportes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=transportes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTransporte.setModel(new TransporteModel(this.transporteLogic.getTransportes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTransporte.setModel(new TransporteModel(this.transportes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTransporte!=null && this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTransporte();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransporte,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TransportePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TransporteConstantesFunciones.SCLASSWEBTITULO,transporteConstantesFunciones.resaltarSeleccionarTransporte,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TransporteConstantesFunciones.SCLASSWEBTITULO,transporteConstantesFunciones.resaltarSeleccionarTransporte,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransporte,TransporteConstantesFunciones.LABEL_ID));

		if(this.transporteConstantesFunciones.mostraridTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransporteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transporteConstantesFunciones.resaltaridTransporte,this.transporteConstantesFunciones.activaridTransporte,this,true,"idTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transporteConstantesFunciones.resaltaridTransporte,this.transporteConstantesFunciones.activaridTransporte,this,true,"idTransporte","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransporte,TransporteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.transporteConstantesFunciones.mostrarid_empresaTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransporteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.transporteConstantesFunciones.resaltarid_empresaTransporte,this,this.transporteConstantesFunciones.activarid_empresaTransporte));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.transporteConstantesFunciones.resaltarid_empresaTransporte,this,this.transporteConstantesFunciones.activarid_empresaTransporte,false,"id_empresaTransporte","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransporte,TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE));

		if(this.transporteConstantesFunciones.mostrarid_tipo_via_transporteTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoViaTransporteTableCell(this.tipoviatransportesForeignKey,this.transporteConstantesFunciones.resaltarid_tipo_via_transporteTransporte,this,this.transporteConstantesFunciones.activarid_tipo_via_transporteTransporte));
			tableColumn.setCellEditor(new TipoViaTransporteTableCell(this.tipoviatransportesForeignKey,this.transporteConstantesFunciones.resaltarid_tipo_via_transporteTransporte,this,this.transporteConstantesFunciones.activarid_tipo_via_transporteTransporte,true,"id_tipo_via_transporteTransporte","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransporte,TransporteConstantesFunciones.LABEL_CODIGO));

		if(this.transporteConstantesFunciones.mostrarcodigoTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransporteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transporteConstantesFunciones.resaltarcodigoTransporte,this.transporteConstantesFunciones.activarcodigoTransporte,this,true,"codigoTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transporteConstantesFunciones.resaltarcodigoTransporte,this.transporteConstantesFunciones.activarcodigoTransporte,this,true,"codigoTransporte","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransporte,TransporteConstantesFunciones.LABEL_NOMBRE));

		if(this.transporteConstantesFunciones.mostrarnombreTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransporteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transporteConstantesFunciones.resaltarnombreTransporte,this.transporteConstantesFunciones.activarnombreTransporte,this,true,"nombreTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transporteConstantesFunciones.resaltarnombreTransporte,this.transporteConstantesFunciones.activarnombreTransporte,this,true,"nombreTransporte","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.transporteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transporteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transporteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransporte.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transporteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transporteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransporte.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTransporte && this.isPermisoGuardarCambiosTransporte) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.transporteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.transporteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTransporte.addColumn(tableColumn);
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
			
			this.jTableDatosTransporte.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransporte && this.isPermisoGuardarCambiosTransporte) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransporte && this.isPermisoGuardarCambiosTransporte) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTransporte.moveColumn(this.jTableDatosTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTransporte.moveColumn(this.jTableDatosTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTransporte.moveColumn(this.jTableDatosTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTransporte.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTransporte.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTransporte,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTransporte.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTransporte.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTransporte.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTransporte.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTransporte.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=transporteLogic.getTransportes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=transportes.size()-1;
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
		//this.jTableDatosTransporte.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTransporte();
			
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
				
				//this.isEsNuevoTransporte=false;
					
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
				if(this.transporteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTransporte==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransporte.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransporte.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.transporte.getsType().equals("DUPLICADO")
				   || this.transporte.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTransporte=true;
				
				} else {
					this.isEsNuevoTransporte=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
					if(this.transporte.getId()>=0 && !this.transporte.getIsNew()) {						
						this.isEsNuevoTransporte=false;
						
					} else {
						this.isEsNuevoTransporte=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTransporte(esRelaciones);						
				
				this.seleccionarTransporte(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.transporte.getId()<0) {
					this.isEsNuevoTransporte=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTransporte(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTransporte(evt,rowIndex);
				}	
				
				if(this.transporteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Transporte: " + this.dDif); 
					}
				}								
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTransporte(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.transporte)) {
					if(this.transporte.getId()>0) {
						this.transporte.setIsDeleted(true);
						
						this.transportesEliminados.add(this.transporte);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transporteLogic.getTransportes().remove(this.transporte);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transportes.remove(this.transporte);				
					}
					
					
					((TransporteModel) this.jTableDatosTransporte.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTransporte(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTransporte(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTransporte) {
			
			if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransporte.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransporte.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTransporte(this.transporte);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.transporteConstantesFunciones.cargarid_empresaTransporte || this.transporteConstantesFunciones.event_dependid_empresaTransporte) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.transporte.getid_empresa());
									//this.inicializarActualizarBindingTransporte(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(transporte.getEmpresa()!=null) {
							this.empresasForeignKey.add(transporte.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.transporte.getid_empresa(),false,"Formulario");

					//TipoViaTransporte
					if(!this.transporteConstantesFunciones.cargarid_tipo_via_transporteTransporte || this.transporteConstantesFunciones.event_dependid_tipo_via_transporteTransporte) {
						//this.cargarCombosTipoViaTransportesForeignKeyLista(" where id="+this.transporte.getid_tipo_via_transporte());
									//this.inicializarActualizarBindingTransporte(false,false);
						this.tipoviatransportesForeignKey=new ArrayList<TipoViaTransporte>();

						if(transporte.getTipoViaTransporte()!=null) {
							this.tipoviatransportesForeignKey.add(transporte.getTipoViaTransporte());
						}

						this.addItemDefectoCombosForeignKeyTipoViaTransporte();
						this.cargarCombosFrameTipoViaTransportesForeignKey("Todos");
					}
					this.setActualTipoViaTransporteForeignKey(this.transporte.getid_tipo_via_transporte(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTransporte("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTransporte(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransporte() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransporte(Transporte transporte) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTransporte(transporte,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransporte(Transporte transporte,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTransporte(transporte);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTransporte(transporte,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTransporte(transporte);
	}
	
	public void setVariablesObjetoActualToFormularioTransporte(Transporte transporte) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTransporte.jLabelidTransporte.setText(transporte.getId().toString());
			this.jInternalFrameDetalleFormTransporte.jTextFieldcodigoTransporte.setText(transporte.getcodigo());
			this.jInternalFrameDetalleFormTransporte.jTextAreanombreTransporte.setText(transporte.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Transporte transporteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,transporteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Transporte transporteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				transporteLocal=this.transporte;
			} else {
				transporteLocal=this.transporteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(transporteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTransporte(transporteLocal,true);
					
					if(transporteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(transporteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.transporteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(transporteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTransporte(Transporte transporte,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransporte(transporte,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTransporte(transporte);
	}
	
	public void setVariablesFormularioToObjetoActualTransporte(Transporte transporte,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransporte(transporte,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTransporte(Transporte transporte,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTransporte.jLabelidTransporte.getText()==null || this.jInternalFrameDetalleFormTransporte.jLabelidTransporte.getText()=="" || this.jInternalFrameDetalleFormTransporte.jLabelidTransporte.getText()=="Id") {
				this.jInternalFrameDetalleFormTransporte.jLabelidTransporte.setText("0");
			}

			if(conColumnasBase) {transporte.setId(Long.parseLong(this.jInternalFrameDetalleFormTransporte.jLabelidTransporte.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransporteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransporte.jLabelIdTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transporte.setcodigo(this.jInternalFrameDetalleFormTransporte.jTextFieldcodigoTransporte.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransporteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransporte.jLabelcodigoTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transporte.setnombre(this.jInternalFrameDetalleFormTransporte.jTextAreanombreTransporte.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransporteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransporte.jLabelnombreTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransporte(Transporte transporteBean,Transporte transporte,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && transporteBean.getid_tipo_via_transporte()!=null && !transporteBean.getid_tipo_via_transporte().equals(-1L))) {transporte.setid_tipo_via_transporte(transporteBean.getid_tipo_via_transporte());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTransporte(Transporte transporteOrigen,Transporte transporte,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transporteOrigen.getId()!=null && !transporteOrigen.getId().equals(0L))) {transporte.setId(transporteOrigen.getId());}}
			if(conDefault || (!conDefault && transporteOrigen.getid_tipo_via_transporte()!=null && !transporteOrigen.getid_tipo_via_transporte().equals(-1L))) {transporte.setid_tipo_via_transporte(transporteOrigen.getid_tipo_via_transporte());}
			if(conDefault || (!conDefault && transporteOrigen.getcodigo()!=null && !transporteOrigen.getcodigo().equals(""))) {transporte.setcodigo(transporteOrigen.getcodigo());}
			if(conDefault || (!conDefault && transporteOrigen.getnombre()!=null && !transporteOrigen.getnombre().equals(""))) {transporte.setnombre(transporteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransporte(Transporte transporte) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransporte.jLabelidTransporte.setText(transporte.getId().toString());
			this.jInternalFrameDetalleFormTransporte.jTextFieldcodigoTransporte.setText(transporte.getcodigo());
			this.jInternalFrameDetalleFormTransporte.jTextAreanombreTransporte.setText(transporte.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransporte(TransporteBean transporteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransporte.jLabelidTransporte.setText(transporteBean.getId().toString());
			this.jInternalFrameDetalleFormTransporte.jTextFieldcodigoTransporte.setText(transporteBean.getcodigo());
			this.jInternalFrameDetalleFormTransporte.jTextAreanombreTransporte.setText(transporteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTransporte(TransporteParameterReturnGeneral transporteReturnGeneral,TransporteBean transporteBean,Boolean conDefault) throws Exception { 
		try {
			Transporte transporteLocal=new Transporte();
			
			transporteLocal=transporteReturnGeneral.getTransporte();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transporteLocal.getId()!=null && !transporteLocal.getId().equals(0L))) {transporteBean.setId(transporteLocal.getId());}}
			if(conDefault || (!conDefault && transporteLocal.getid_tipo_via_transporte()!=null && !transporteLocal.getid_tipo_via_transporte().equals(-1L))) {transporteBean.setid_tipo_via_transporte(transporteLocal.getid_tipo_via_transporte());}
			if(conDefault || (!conDefault && transporteLocal.getcodigo()!=null && !transporteLocal.getcodigo().equals(""))) {transporteBean.setcodigo(transporteLocal.getcodigo());}
			if(conDefault || (!conDefault && transporteLocal.getnombre()!=null && !transporteLocal.getnombre().equals(""))) {transporteBean.setnombre(transporteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTransporteGenerico(Long idTransporteSeleccionado,JComboBox jComboBoxTransporte,List<Transporte> transportesLocal)throws Exception {
		try {
			Transporte  transporteTemp=null;

			for(Transporte transporteAux:transportesLocal) {
				if(transporteAux.getId()!=null && transporteAux.getId().equals(idTransporteSeleccionado)) {
					transporteTemp=transporteAux;
					break;
				}
			}

			jComboBoxTransporte.setSelectedItem(transporteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTransporteGenerico(JComboBox jComboBoxTransporte,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransporte.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTransporte.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransporte.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTransporte.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transporte=(Transporte) transporteLogic.getTransportes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transporte =(Transporte) transportes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!transporte.getIsNew() && !transporte.getIsChanged() && !transporte.getIsDeleted()) {
				sDescripcion=transporte.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=transporte.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoViaTransporte")) {
			//sDescripcion=this.getActualTipoViaTransporteForeignKeyDescripcion((Long)value);
			if(!transporte.getIsNew() && !transporte.getIsChanged() && !transporte.getIsDeleted()) {
				sDescripcion=transporte.gettipoviatransporte_descripcion();
			} else {
				//sDescripcion=this.getActualTipoViaTransporteForeignKeyDescripcion((Long)value);
				sDescripcion=transporte.gettipoviatransporte_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Transporte transporteRow=new Transporte();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transporteRow=(Transporte) transporteLogic.getTransportes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transporteRow=(Transporte) transportes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTransporte(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTransporte.setVisible((this.isVisibilidadCeldaNuevoTransporte && this.isPermisoNuevoTransporte));			
			this.jButtonDuplicarTransporte.setVisible((this.isVisibilidadCeldaDuplicarTransporte && this.isPermisoDuplicarTransporte));			
			this.jButtonCopiarTransporte.setVisible((this.isVisibilidadCeldaCopiarTransporte && this.isPermisoCopiarTransporte));
			this.jButtonVerFormTransporte.setVisible((this.isVisibilidadCeldaVerFormTransporte && this.isPermisoVerFormTransporte));
			
			this.jButtonAbrirOrderByTransporte.setVisible((this.isVisibilidadCeldaOrdenTransporte && this.isPermisoOrdenTransporte));			
			
			this.jButtonNuevoRelacionesTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransporte && this.isPermisoNuevoTransporte));			
			this.jButtonNuevoGuardarCambiosTransporte.setVisible((this.isVisibilidadCeldaNuevoTransporte && this.isPermisoNuevoTransporte && this.isPermisoGuardarCambiosTransporte));
			
			if(this.jInternalFrameDetalleFormTransporte!=null) {
			this.jInternalFrameDetalleFormTransporte.jButtonModificarTransporte.setVisible((this.isVisibilidadCeldaModificarTransporte && this.isPermisoActualizarTransporte));	
			this.jInternalFrameDetalleFormTransporte.jButtonActualizarTransporte.setVisible((this.isVisibilidadCeldaActualizarTransporte && this.isPermisoActualizarTransporte));	
			this.jInternalFrameDetalleFormTransporte.jButtonEliminarTransporte.setVisible((this.isVisibilidadCeldaEliminarTransporte && this.isPermisoEliminarTransporte));
			this.jInternalFrameDetalleFormTransporte.jButtonCancelarTransporte.setVisible(this.isVisibilidadCeldaCancelarTransporte);							
			this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosTransporte.setVisible((this.isVisibilidadCeldaGuardarTransporte && this.isPermisoGuardarCambiosTransporte));			
			
			}
						
			this.jButtonGuardarCambiosTablaTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosTransporte && this.isPermisoGuardarCambiosTransporte));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTransporte.setVisible((this.isVisibilidadCeldaNuevoTransporte && this.isPermisoNuevoTransporte));						
			this.jButtonDuplicarToolBarTransporte.setVisible((this.isVisibilidadCeldaDuplicarTransporte && this.isPermisoDuplicarTransporte));						
			this.jButtonCopiarToolBarTransporte.setVisible((this.isVisibilidadCeldaCopiarTransporte && this.isPermisoCopiarTransporte));			
			this.jButtonVerFormToolBarTransporte.setVisible((this.isVisibilidadCeldaVerFormTransporte && this.isPermisoVerFormTransporte));			
			this.jButtonAbrirOrderByToolBarTransporte.setVisible((this.isVisibilidadCeldaOrdenTransporte && this.isPermisoOrdenTransporte));
			this.jButtonNuevoRelacionesToolBarTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransporte && this.isPermisoNuevoTransporte));			
			this.jButtonNuevoGuardarCambiosToolBarTransporte.setVisible((this.isVisibilidadCeldaNuevoTransporte && this.isPermisoNuevoTransporte && this.isPermisoGuardarCambiosTransporte));			
			
			if(this.jInternalFrameDetalleFormTransporte!=null) {
			this.jInternalFrameDetalleFormTransporte.jButtonModificarToolBarTransporte.setVisible((this.isVisibilidadCeldaModificarTransporte && this.isPermisoActualizarTransporte));	
			this.jInternalFrameDetalleFormTransporte.jButtonActualizarToolBarTransporte.setVisible((this.isVisibilidadCeldaActualizarTransporte  && this.isPermisoActualizarTransporte));	
			this.jInternalFrameDetalleFormTransporte.jButtonEliminarToolBarTransporte.setVisible((this.isVisibilidadCeldaEliminarTransporte && this.isPermisoEliminarTransporte));
			this.jInternalFrameDetalleFormTransporte.jButtonCancelarToolBarTransporte.setVisible(this.isVisibilidadCeldaCancelarTransporte);				
			this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosToolBarTransporte.setVisible((this.isVisibilidadCeldaGuardarTransporte && this.isPermisoGuardarCambiosTransporte));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosTransporte && this.isPermisoGuardarCambiosTransporte));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTransporte.setVisible((this.isVisibilidadCeldaNuevoTransporte && this.isPermisoNuevoTransporte));			
			this.jMenuItemDuplicarTransporte.setVisible((this.isVisibilidadCeldaDuplicarTransporte && this.isPermisoDuplicarTransporte));			
			this.jMenuItemCopiarTransporte.setVisible((this.isVisibilidadCeldaCopiarTransporte && this.isPermisoCopiarTransporte));			
			this.jMenuItemVerFormTransporte.setVisible((this.isVisibilidadCeldaVerFormTransporte && this.isPermisoVerFormTransporte));			
			this.jMenuItemAbrirOrderByTransporte.setVisible((this.isVisibilidadCeldaOrdenTransporte && this.isPermisoOrdenTransporte));			
			//this.jMenuItemMostrarOcultarTransporte.setVisible((this.isVisibilidadCeldaOrdenTransporte && this.isPermisoOrdenTransporte));
			this.jMenuItemDetalleAbrirOrderByTransporte.setVisible((this.isVisibilidadCeldaOrdenTransporte && this.isPermisoOrdenTransporte));			
			//this.jMenuItemDetalleMostrarOcultarTransporte.setVisible((this.isVisibilidadCeldaOrdenTransporte && this.isPermisoOrdenTransporte));			
			this.jMenuItemNuevoRelacionesTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransporte && this.isPermisoNuevoTransporte));			
			this.jMenuItemNuevoGuardarCambiosTransporte.setVisible((this.isVisibilidadCeldaNuevoTransporte && this.isPermisoNuevoTransporte && this.isPermisoGuardarCambiosTransporte));									
			
			if(this.jInternalFrameDetalleFormTransporte!=null) {
			this.jInternalFrameDetalleFormTransporte.jMenuItemModificarTransporte.setVisible((this.isVisibilidadCeldaModificarTransporte && this.isPermisoActualizarTransporte));	
			this.jInternalFrameDetalleFormTransporte.jMenuItemActualizarTransporte.setVisible((this.isVisibilidadCeldaActualizarTransporte && this.isPermisoActualizarTransporte));	
			this.jInternalFrameDetalleFormTransporte.jMenuItemEliminarTransporte.setVisible((this.isVisibilidadCeldaEliminarTransporte && this.isPermisoEliminarTransporte));
			this.jInternalFrameDetalleFormTransporte.jMenuItemCancelarTransporte.setVisible(this.isVisibilidadCeldaCancelarTransporte);				
			}
			
			this.jMenuItemGuardarCambiosTransporte.setVisible((this.isVisibilidadCeldaGuardarTransporte && this.isPermisoGuardarCambiosTransporte));						
			this.jMenuItemGuardarCambiosTablaTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosTransporte && this.isPermisoGuardarCambiosTransporte));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTransporte=this.jButtonNuevoTransporte.isVisible();
			this.isVisibilidadCeldaDuplicarTransporte=this.jButtonDuplicarTransporte.isVisible();
			this.isVisibilidadCeldaCopiarTransporte=this.jButtonCopiarTransporte.isVisible();
			this.isVisibilidadCeldaVerFormTransporte=this.jButtonVerFormTransporte.isVisible();
			
			this.isVisibilidadCeldaOrdenTransporte=this.jButtonAbrirOrderByTransporte.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTransporte=this.jButtonNuevoRelacionesTransporte.isVisible();
			this.isVisibilidadCeldaModificarTransporte=this.jButtonModificarTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormTransporte!=null) {
			this.isVisibilidadCeldaActualizarTransporte=this.jInternalFrameDetalleFormTransporte.jButtonActualizarTransporte.isVisible();
			this.isVisibilidadCeldaEliminarTransporte=this.jInternalFrameDetalleFormTransporte.jButtonEliminarTransporte.isVisible();
			this.isVisibilidadCeldaCancelarTransporte=this.jInternalFrameDetalleFormTransporte.jButtonCancelarTransporte.isVisible();
			this.isVisibilidadCeldaGuardarTransporte=this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosTransporte.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTransporte=this.jButtonGuardarCambiosTablaTransporte.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTransporte=this.jButtonNuevoToolBarTransporte.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransporte=this.jButtonNuevoRelacionesToolBarTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormTransporte!=null) {
			this.isVisibilidadCeldaModificarTransporte=this.jInternalFrameDetalleFormTransporte.jButtonModificarToolBarTransporte.isVisible();
			this.isVisibilidadCeldaActualizarTransporte=this.jInternalFrameDetalleFormTransporte.jButtonActualizarToolBarTransporte.isVisible();
			this.isVisibilidadCeldaEliminarTransporte=this.jInternalFrameDetalleFormTransporte.jButtonEliminarToolBarTransporte.isVisible();
			this.isVisibilidadCeldaCancelarTransporte=this.jInternalFrameDetalleFormTransporte.jButtonCancelarToolBarTransporte.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransporte=this.jButtonGuardarCambiosToolBarTransporte.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransporte=this.jButtonGuardarCambiosTablaToolBarTransporte.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTransporte=this.jMenuItemNuevoTransporte.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransporte=this.jMenuItemNuevoRelacionesTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormTransporte!=null) {
			this.isVisibilidadCeldaModificarTransporte=this.jInternalFrameDetalleFormTransporte.jMenuItemModificarTransporte.isVisible();
			this.isVisibilidadCeldaActualizarTransporte=this.jInternalFrameDetalleFormTransporte.jMenuItemActualizarTransporte.isVisible();
			this.isVisibilidadCeldaEliminarTransporte=this.jInternalFrameDetalleFormTransporte.jMenuItemEliminarTransporte.isVisible();
			this.isVisibilidadCeldaCancelarTransporte=this.jInternalFrameDetalleFormTransporte.jMenuItemCancelarTransporte.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransporte=this.jMenuItemGuardarCambiosTransporte.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransporte=this.jMenuItemGuardarCambiosTablaTransporte.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTransporte(Boolean esInicializar) {
		if(TransporteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.transporteSessionBean.getConGuardarRelaciones()) {
				//if(this.transporteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTransporte();
			}
			
			this.inicializarActualizarBindingBotonesManualTransporte(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTransporte() {
		this.jButtonNuevoTransporte.setVisible(this.isPermisoNuevoTransporte);			
		this.jButtonDuplicarTransporte.setVisible(this.isPermisoDuplicarTransporte);			
		this.jButtonCopiarTransporte.setVisible(this.isPermisoCopiarTransporte);			
		this.jButtonVerFormTransporte.setVisible(this.isPermisoVerFormTransporte);			
		
		this.jButtonAbrirOrderByTransporte.setVisible(this.isPermisoOrdenTransporte);					
		
		this.jButtonNuevoRelacionesTransporte.setVisible(this.isPermisoNuevoTransporte);			
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jButtonModificarTransporte.setVisible(this.isPermisoActualizarTransporte);	
			this.jInternalFrameDetalleFormTransporte.jButtonActualizarTransporte.setVisible(this.isPermisoActualizarTransporte);	
			this.jInternalFrameDetalleFormTransporte.jButtonEliminarTransporte.setVisible(this.isPermisoEliminarTransporte);
			this.jInternalFrameDetalleFormTransporte.jButtonCancelarTransporte.setVisible(this.isVisibilidadCeldaCancelarTransporte);						
			this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosTransporte.setVisible(this.isPermisoGuardarCambiosTransporte);							
		}
		
		this.jButtonGuardarCambiosTablaTransporte.setVisible(this.isPermisoActualizarTransporte);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTransporte() {
		this.jInternalFrameDetalleFormTransporte.jButtonModificarTransporte.setVisible(this.isPermisoActualizarTransporte);	
		this.jInternalFrameDetalleFormTransporte.jButtonActualizarTransporte.setVisible(this.isPermisoActualizarTransporte);	
		this.jInternalFrameDetalleFormTransporte.jButtonEliminarTransporte.setVisible(this.isPermisoEliminarTransporte);
		this.jInternalFrameDetalleFormTransporte.jButtonCancelarTransporte.setVisible(this.isVisibilidadCeldaCancelarTransporte);							
		this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosTransporte.setVisible((this.isVisibilidadCeldaGuardarTransporte && this.isPermisoGuardarCambiosTransporte));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTransporte() {
		if(TransporteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTransporte();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTransporte() {
	}
	
	public void jTableDatosTransporteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTransporte(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransporte(this.gettransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transporte==null) {
						this.transporte = new Transporte();
					}

					this.setVariablesFormularioToObjetoActualTransporte(this.transporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
				}

				if(this.transporte.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.transporte.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTransporte(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransporte(this.gettransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.transporteLogic.getConnexion());

				if(this.transporte.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.transporte.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransporte=(TitledBorder)this.jScrollPanelDatosTransporte.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTransporte.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransporte(this.gettransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transporte==null) {
						this.transporte = new Transporte();
					}

					this.setVariablesFormularioToObjetoActualTransporte(this.transporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
				}

				if(this.transporte.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.transporte.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_via_transporteTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoviatransporte=true;

			idTienePermisotipoviatransporte=this.tienePermisosUsuarioEnPaginaWebTransporte(TipoViaTransporteConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoviatransporte) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransporte(this.gettransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);

				this.tipoviatransporteBeanSwingJInternalFrame=new TipoViaTransporteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoviatransporteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoviatransporteBeanSwingJInternalFrame.getTipoViaTransporteLogic().setConnexion(this.transporteLogic.getConnexion());

				if(this.transporte.getid_tipo_via_transporte()!=null) {
					this.tipoviatransporteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoviatransporteBeanSwingJInternalFrame.setIdActual(this.transporte.getid_tipo_via_transporte());
					this.tipoviatransporteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoviatransporteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoviatransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoViaTransporte();
				}

				JInternalFrameBase jinternalFrame =this.tipoviatransporteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransporte=(TitledBorder)this.jScrollPanelDatosTransporte.getBorder();
				TitledBorder titledBordertipoviatransporte=(TitledBorder)this.tipoviatransporteBeanSwingJInternalFrame.jScrollPanelDatosTipoViaTransporte.getBorder();

				titledBordertipoviatransporte.setTitle(titledBorderTransporte.getTitle() + " -> Tipo Via Transporte");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_via_transporteTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransporte(this.gettransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transporte==null) {
						this.transporte = new Transporte();
					}

					this.setVariablesFormularioToObjetoActualTransporte(this.transporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
				}

				if(this.transporte.getid_tipo_via_transporte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_via_transporte = "+this.transporte.getid_tipo_via_transporte().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransporte(this.gettransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transporte==null) {
						this.transporte = new Transporte();
					}

					this.setVariablesFormularioToObjetoActualTransporte(this.transporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
				}

				if(this.transporte.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.transporte.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransporte(this.gettransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transporte==null) {
						this.transporte = new Transporte();
					}

					this.setVariablesFormularioToObjetoActualTransporte(this.transporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);
				}

				if(this.transporte.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.transporte.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransporte(false,false);

			this.getTransportesBusquedaPorCodigo();

			this.inicializarActualizarBindingTransporte(false);

			//if(TransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransporte(false,false);

			this.getTransportesBusquedaPorNombre();

			this.inicializarActualizarBindingTransporte(false);

			//if(TransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransporte(false,false);

			this.getTransportesFK_IdEmpresa();

			this.inicializarActualizarBindingTransporte(false);

			//if(TransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoViaTransporteTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransporte(false,false);

			this.getTransportesFK_IdTipoViaTransporte();

			this.inicializarActualizarBindingTransporte(false);

			//if(TransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTransporte() {
		if(this.jInternalFrameDetalleFormTransporte!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTransporte!=null) {
			this.jInternalFrameDetalleFormTransporte.setVisible(false);	    			
			this.jInternalFrameDetalleFormTransporte.dispose();
			this.jInternalFrameDetalleFormTransporte=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTransporte!=null) {
			this.jInternalFrameReporteDinamicoTransporte.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTransporte.dispose();
			this.jInternalFrameReporteDinamicoTransporte=null;
		}
		
		if(this.jInternalFrameImportacionTransporte!=null) {
			this.jInternalFrameImportacionTransporte.setVisible(false);	    			
			this.jInternalFrameImportacionTransporte.dispose();
			this.jInternalFrameImportacionTransporte=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTransporte();
			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTransporte")) {
				jButtonNuevoTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTransporte")) {
				jButtonDuplicarTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTransporte")) {
				jButtonCopiarTransporteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTransporte")) {
				jButtonVerFormTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTransporte")) {
				jButtonNuevoTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTransporte")) {
				jButtonDuplicarTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTransporte")) {
				jButtonNuevoTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTransporte")) {
				jButtonDuplicarTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTransporte")) {
				jButtonNuevoTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTransporte")) {
				jButtonNuevoTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTransporte")) {
				jButtonNuevoTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTransporte")) {
				jButtonModificarTransporteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTransporte")) {
				jButtonModificarTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTransporte")) {
				jButtonModificarTransporteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTransporte")) {
				jButtonActualizarTransporteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTransporte")) {
				jButtonActualizarTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTransporte")) {
				jButtonActualizarTransporteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTransporte")) {
				jButtonEliminarTransporteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTransporte")) {
				jButtonEliminarTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTransporte")) {
				jButtonEliminarTransporteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTransporte")) {
				jButtonCancelarTransporteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTransporte")) {
				jButtonCancelarTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTransporte")) {
				jButtonCancelarTransporteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTransporte")) {
				jButtonCerrarTransporteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTransporte")) {
				jButtonCerrarTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTransporte")) {
				jButtonCerrarTransporteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTransporte")) {
				jButtonMostrarOcultarTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTransporte")) {
				jButtonCancelarTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTransporte")) {
				jButtonGuardarCambiosTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTransporte")) {
				jButtonGuardarCambiosTransporteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTransporte")) {
				jButtonCopiarTransporteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTransporte")) {
				jButtonVerFormTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTransporte")) {
				jButtonGuardarCambiosTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTransporte")) {
				jButtonCopiarTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTransporte")) {
				jButtonVerFormTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTransporte")) {
				jButtonGuardarCambiosTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTransporte")) {
				jButtonGuardarCambiosTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTransporte")) {
				jButtonGuardarCambiosTransporteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTransporte")) {
				jButtonRecargarInformacionTransporteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTransporte")) {
				jButtonRecargarInformacionTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTransporte")) {
				jButtonRecargarInformacionTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTransporte")) {
				jButtonAnterioresTransporteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTransporte")) {
				jButtonAnterioresTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTransporte")) {
				jButtonAnterioresTransporteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTransporte")) {
				jButtonSiguientesTransporteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTransporte")) {
				jButtonSiguientesTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTransporte")) {
				jButtonSiguientesTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTransporte") || sTipo.equals("MenuItemDetalleAbrirOrderByTransporte")) {
				jButtonAbrirOrderByTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTransporte") || sTipo.equals("MenuItemDetalleMostrarOcultarTransporte")) {
				jButtonMostrarOcultarTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTransporte")) {
				jButtonNuevoGuardarCambiosTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTransporte")) {
				jButtonNuevoGuardarCambiosTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTransporte")) {
				jButtonNuevoGuardarCambiosTransporteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTransporte")) {
				jButtonCerrarReporteDinamicoTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTransporte")) {
				jButtonGenerarReporteDinamicoTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTransporte")) {
				
				jButtonGenerarExcelReporteDinamicoTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTransporte")) {
				jButtonCerrarImportacionTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTransporte")) {
				
				jButtonGenerarImportacionTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTransporte")) {
				
				jButtonAbrirImportacionTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTransporte")) {
				jComboBoxTiposAccionesTransporteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTransporte")) {
				jComboBoxTiposRelacionesTransporteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTransporte")) {
				jComboBoxTiposAccionesTransporteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTransporte")) {
				
				jComboBoxTiposSeleccionarTransporteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTransporte")) {
				jTextFieldValorCampoGeneralTransporteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTransporte")) {
				jButtonAbrirOrderByTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTransporte")) {
				jButtonAbrirOrderByTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTransporte")) {
				jButtonCerrarOrderByTransporteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransporteBusqueda")) {
				this.jButtonidTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransporteUpdate")) {
				this.jButtonid_empresaTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransporteBusqueda")) {
				this.jButtonid_empresaTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_via_transporteTransporteUpdate")) {
				this.jButtonid_tipo_via_transporteTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_via_transporteTransporteBusqueda")) {
				this.jButtonid_tipo_via_transporteTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTransporteBusqueda")) {
				this.jButtoncodigoTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTransporteBusqueda")) {
				this.jButtonnombreTransporteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTransporte")) {
				this.jButtonBusquedaPorCodigoTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTransporte")) {
				this.jButtonBusquedaPorNombreTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoViaTransporteTransporte")) {
				this.jButtonFK_IdTipoViaTransporteTransporteActionPerformed(evt);
			}
			
			;
			
			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTransporte();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransporteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				


				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Transporte transporteLocal=null;
			
			if(!this.getEsControlTabla()) {
				transporteLocal=this.transporte;
			} else {
				transporteLocal=this.transporteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
							
				
				


				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteAnterior =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transporteAnterior =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
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
			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
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
			
			


			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransporteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
								
						
				


				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transporte.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
								
				
				


				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteAnterior =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transporteAnterior =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transporte);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteAnterior =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transporteAnterior =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransporteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
							
				
				


				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transporte.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransporteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transporteAnterior =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transporteAnterior =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
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
			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
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
			
			


			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransporteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
								
				
				


				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteAnterior =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transporteAnterior =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransporteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransporteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTransporte")) {
					jCheckBoxSeleccionarTodosTransporteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTransporte")) {
					jCheckBoxSeleccionadosTransporteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTransporte")) {
					
				}
				
				


				
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
												
				
				


				
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransporteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transporteAnterior =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transporteAnterior =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransporteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
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
			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
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
			
			


			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransporteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transporte.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transporte.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transporte);
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
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
				
				


				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transporte.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transporteAnterior =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transporteAnterior =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTransporte")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTransporteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTransporte.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.transporte =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.transporte =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.transporte);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTransporte")) {
				
				}
				
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTransporte")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTransporte.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTransporte")) {
			
			}
			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTransporte();
			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
			if(sTipo.equals("NuevoTransporte")) {
				jButtonNuevoTransporteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTransporte")) {
				jButtonDuplicarTransporteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTransporte")) {
				jButtonCopiarTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTransporte")) {
				jButtonVerFormTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTransporte")) {
				jButtonNuevoTransporteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTransporte")) {
				jButtonModificarTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTransporte")) {
				jButtonActualizarTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTransporte")) {
				jButtonEliminarTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTransporte")) {
				jButtonGuardarCambiosTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTransporte")) {
				jButtonCancelarTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTransporte")) {
				jButtonCerrarTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTransporte")) {
				jButtonGuardarCambiosTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTransporte")) {
				jButtonNuevoGuardarCambiosTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTransporte")) {
				jButtonAbrirOrderByTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTransporte")) {
				jButtonRecargarInformacionTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTransporte")) {
				jButtonAnterioresTransporteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTransporte")) {
				jButtonSiguientesTransporteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransporteBusqueda")) {
				this.jButtonidTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransporteUpdate")) {
				this.jButtonid_empresaTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransporteBusqueda")) {
				this.jButtonid_empresaTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_via_transporteTransporteUpdate")) {
				this.jButtonid_tipo_via_transporteTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_via_transporteTransporteBusqueda")) {
				this.jButtonid_tipo_via_transporteTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTransporteBusqueda")) {
				this.jButtoncodigoTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTransporteBusqueda")) {
				this.jButtonnombreTransporteBusquedaActionPerformed(evt);
			}
			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTransporte();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTransporte")) {
				closingInternalFrameTransporte();
				
			} else if(sTipo.equals("jButtonCancelarTransporte")) {
				JInternalFrameBase jInternalFrameDetalleFormTransporte = (JInternalFrameBase)evt.getSource();
	            	
	            TransporteBeanSwingJInternalFrame jInternalFrameParent=(TransporteBeanSwingJInternalFrame)jInternalFrameDetalleFormTransporte.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTransporteActionPerformed(null);
			}
			
			TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transporte,new Object(),this.transporteParameterGeneral,this.transporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTransporte(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTransporte(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTransporte(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.transporte)) {
			if(!esControlTabla) {
				if(TransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTransporte(this.transporte,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);			
				}
				
				if(this.transporteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTransporte(this.transporte,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transporteReturnGeneral=transporteLogic.procesarEventosTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transporteLogic.getTransportes(),this.transporte,this.transporteParameterGeneral,this.isEsNuevoTransporte,classes);//this.transporteLogic.getTransporte()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTransporte(this.transporteReturnGeneral,this.transporteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.transporteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTransporte(classes,this.transporteReturnGeneral,this.transporteBean,false);
					}
						
					if(this.transporteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTransporte(this.transporteReturnGeneral.getTransporte());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTransporte(this.transporteReturnGeneral.getTransporte());	
					}
						
					if(this.transporteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTransporte(this.transporteReturnGeneral.getTransporte(),classes);//this.transporteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTransporte(this.transporte,classes);//this.transporteBean);									
				}
			
				if(TransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTransporte(this.transporte,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransporte(this.transporte);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.transporteAnterior!=null) {
						this.transporte=this.transporteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transporteReturnGeneral=transporteLogic.procesarEventosTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transporteLogic.getTransportes(),this.transporte,this.transporteParameterGeneral,this.isEsNuevoTransporte,classes);//this.transporteLogic.getTransporte()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transporteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transporteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.transporteReturnGeneral.getTransporte(),transporteLogic.getTransportes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.transporteReturnGeneral.getTransporte(),this.transportes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTransporte.repaint();
				
				//((AbstractTableModel) this.jTableDatosTransporte.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTransporte();
			}
		}
	}
	
	public void actualizarVisualTableDatosTransporte() throws Exception {
		
		TransporteModel transporteModel=(TransporteModel)this.jTableDatosTransporte.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transporteModel.transportes=this.transporteLogic.getTransportes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			transporteModel.transportes=this.transportes;
		}
		
		
		((TransporteModel) this.jTableDatosTransporte.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTransporte() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettransporteAnterior(),this.transporteLogic.getTransportes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettransporteAnterior(),this.transportes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTransporte();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTransporte(Transporte transporte,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
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
										
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transporte,new Object(),generalEntityParameterGeneral,this.transporteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.transporteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TransporteConstantesFunciones.getClassesRelationshipsOfTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TransporteConstantesFunciones.getClassesRelationshipsFromStringsOfTransporte(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTransporte(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transporte,new Object(),generalEntityParameterGeneral,this.transporteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTransporte(TransporteBean transporteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTransporte(ArrayList<Classe> classes,TransporteReturnGeneral transporteReturnGeneral,TransporteBean transporteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTransporte(Transporte transporte,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.transporte)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTransporte = new TransporteDetalleFormJInternalFrame(jDesktopPane,this.transporteSessionBean.getConGuardarRelaciones(),this.transporteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTransporte);
		this.jInternalFrameDetalleFormTransporte.setVisible(false);
		this.jInternalFrameDetalleFormTransporte.setSelected(false);						
		
		this.jInternalFrameDetalleFormTransporte.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTransporte.transporteLogic=this.transporteLogic;
		
		this.cargarCombosFrameForeignKeyTransporte("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTransporte();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransporte();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTransporte("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTransporte();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTransporte.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransporte"));
		
		this.jInternalFrameDetalleFormTransporte.jButtonModificarTransporte.addActionListener(new ButtonActionListener(this,"ModificarTransporte"));

		
		this.jInternalFrameDetalleFormTransporte.jButtonModificarToolBarTransporte.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransporte"));
					
		this.jInternalFrameDetalleFormTransporte.jMenuItemModificarTransporte.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormTransporte.jButtonActualizarTransporte.addActionListener (new ButtonActionListener(this,"ActualizarTransporte"));
		
		
		this.jInternalFrameDetalleFormTransporte.jButtonActualizarToolBarTransporte.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransporte"));
						
		this.jInternalFrameDetalleFormTransporte.jMenuItemActualizarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormTransporte.jButtonEliminarTransporte.addActionListener (new ButtonActionListener(this,"EliminarTransporte"));
		
		
		this.jInternalFrameDetalleFormTransporte.jButtonEliminarToolBarTransporte.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransporte"));
								
		this.jInternalFrameDetalleFormTransporte.jMenuItemEliminarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormTransporte.jButtonCancelarTransporte.addActionListener (new ButtonActionListener(this,"CancelarTransporte"));
		
		
		this.jInternalFrameDetalleFormTransporte.jButtonCancelarToolBarTransporte.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransporte"));
					
		this.jInternalFrameDetalleFormTransporte.jMenuItemCancelarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransporte"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTransporte.jMenuItemDetalleCerrarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosToolBarTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransporte"));
		
		
		
		this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosToolBarTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransporte"));
		
		
		
		this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransporte"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonidTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransporte.jButtonid_empresaTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonid_empresaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransporte.jButtonid_tipo_via_transporteTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonid_tipo_via_transporteTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtoncodigoTransporteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonnombreTransporteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransporteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTransporte.jTabbedPaneRelacionesTransporte.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransporte"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTransporte"));
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransporte"));
		}
		
		this.jTableDatosTransporte.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTransporte"));
		
		this.jTableDatosTransporte.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTransporte"));
		
		this.jButtonNuevoTransporte.addActionListener(new ButtonActionListener(this,"NuevoTransporte"));
		
		this.jButtonDuplicarTransporte.addActionListener(new ButtonActionListener(this,"DuplicarTransporte"));
		
		this.jButtonCopiarTransporte.addActionListener(new ButtonActionListener(this,"CopiarTransporte"));
		
		this.jButtonVerFormTransporte.addActionListener(new ButtonActionListener(this,"VerFormTransporte"));
		
		
		this.jButtonNuevoToolBarTransporte.addActionListener(new ButtonActionListener(this,"NuevoToolBarTransporte"));
			
		this.jButtonDuplicarToolBarTransporte.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTransporte"));
			
		this.jMenuItemNuevoTransporte.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTransporte"));
			
		this.jMenuItemDuplicarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTransporte"));		
		
		
		this.jButtonNuevoRelacionesTransporte.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTransporte"));
		
		
		this.jButtonNuevoRelacionesToolBarTransporte.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTransporte"));
			
		this.jMenuItemNuevoRelacionesTransporte.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTransporte"));		
		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jButtonModificarTransporte.addActionListener(new ButtonActionListener(this,"ModificarTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jButtonModificarToolBarTransporte.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransporte"));
			
			this.jInternalFrameDetalleFormTransporte.jMenuItemModificarTransporte.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTransporte.jButtonActualizarTransporte.addActionListener (new ButtonActionListener(this,"ActualizarTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jButtonActualizarToolBarTransporte.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransporte"));
				
			this.jInternalFrameDetalleFormTransporte.jMenuItemActualizarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jButtonEliminarTransporte.addActionListener (new ButtonActionListener(this,"EliminarTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jButtonEliminarToolBarTransporte.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransporte"));
						
			this.jInternalFrameDetalleFormTransporte.jMenuItemEliminarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jButtonCancelarTransporte.addActionListener (new ButtonActionListener(this,"CancelarTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jButtonCancelarToolBarTransporte.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransporte"));
			
			this.jInternalFrameDetalleFormTransporte.jMenuItemCancelarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransporte"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTransporte.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTransporte"));		
		
		
		this.jButtonCerrarTransporte.addActionListener (new ButtonActionListener(this,"CerrarTransporte"));
		
		
		this.jButtonCerrarToolBarTransporte.addActionListener (new ButtonActionListener(this,"CerrarToolBarTransporte"));
			
		this.jMenuItemCerrarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTransporte"));
			
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jMenuItemDetalleCerrarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosToolBarTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransporte"));
		}
		
		this.jButtonCopiarToolBarTransporte.addActionListener (new ButtonActionListener(this,"CopiarToolBarTransporte"));
			
		this.jButtonVerFormToolBarTransporte.addActionListener (new ButtonActionListener(this,"VerFormToolBarTransporte"));
		
		this.jMenuItemGuardarCambiosTransporte.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTransporte"));
			
		this.jMenuItemCopiarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTransporte"));		
		
		this.jMenuItemVerFormTransporte.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTransporte"));		
		
		
		this.jButtonGuardarCambiosTablaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransporte"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTransporte"));
			
		this.jMenuItemGuardarCambiosTablaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransporte"));		
		
		
		
		this.jButtonRecargarInformacionTransporte.addActionListener (new ButtonActionListener(this,"RecargarInformacionTransporte"));
					
		this.jButtonRecargarInformacionToolBarTransporte.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTransporte"));
		
		this.jMenuItemRecargarInformacionTransporte.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTransporte"));		
		
		
		
		this.jButtonAnterioresTransporte.addActionListener (new ButtonActionListener(this,"AnterioresTransporte"));
		
		
		this.jButtonAnterioresToolBarTransporte.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTransporte"));
		
		this.jMenuItemAnterioresTransporte.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTransporte"));		
		
		
		this.jButtonSiguientesTransporte.addActionListener (new ButtonActionListener(this,"SiguientesTransporte"));
		
		
		this.jButtonSiguientesToolBarTransporte.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTransporte"));
			
		this.jMenuItemSiguientesTransporte.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTransporte"));
			
		this.jMenuItemAbrirOrderByTransporte.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTransporte"));
			
		this.jMenuItemMostrarOcultarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTransporte"));
			
		this.jMenuItemDetalleAbrirOrderByTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTransporte"));
			
		this.jMenuItemDetalleMostarOcultarTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTransporte"));		
		
		
		this.jButtonNuevoGuardarCambiosTransporte.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTransporte"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransporte.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTransporte"));
			
		this.jMenuItemNuevoGuardarCambiosTransporte.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTransporte"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTransporte.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTransporte"));

		this.jCheckBoxSeleccionadosTransporte.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTransporte"));
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransporte"));
		}
		
		
		this.jComboBoxTiposRelacionesTransporte.addActionListener (new ButtonActionListener(this,"TiposRelacionesTransporte"));
			
		this.jComboBoxTiposAccionesTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesTransporte"));
					
		this.jComboBoxTiposSeleccionarTransporte.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTransporte"));
			
		this.jTextFieldValorCampoGeneralTransporte.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTransporte"));		
		
		
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonidTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransporte.jButtonid_empresaTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonid_empresaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransporte.jButtonid_tipo_via_transporteTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonid_tipo_via_transporteTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtoncodigoTransporteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonnombreTransporteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransporteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTransporte.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTransporte"));

			this.jButtonBusquedaPorNombreTransporte.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTransporte"));

			this.jButtonFK_IdTipoViaTransporteTransporte.addActionListener(new ButtonActionListener(this,"FK_IdTipoViaTransporteTransporte"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTransporte!=null) {
				this.jInternalFrameReporteDinamicoTransporte.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransporte"));
				this.jInternalFrameReporteDinamicoTransporte.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransporte"));
				this.jInternalFrameReporteDinamicoTransporte.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransporte"));
			}
			
			//this.jButtonCerrarReporteDinamicoTransporte.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransporte"));				
			//this.jButtonGenerarReporteDinamicoTransporte.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransporte"));
			//this.jButtonGenerarExcelReporteDinamicoTransporte.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransporte"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTransporte!=null) {
				this.jInternalFrameImportacionTransporte.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransporte"));
				this.jInternalFrameImportacionTransporte.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransporte"));
				this.jInternalFrameImportacionTransporte.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransporte"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTransporte.addActionListener (new ButtonActionListener(this,"AbrirOrderByTransporte"));
			
			this.jButtonAbrirOrderByToolBarTransporte.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTransporte"));			
			
			if(this.jInternalFrameOrderByTransporte!=null) {
				this.jInternalFrameOrderByTransporte.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransporte"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransporte.jTabbedPaneRelacionesTransporte.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransporte"));
		
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
            		closingInternalFrameTransporte();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTransporte.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTransporte = (JInternalFrameBase)event.getSource();
	            	
	            TransporteBeanSwingJInternalFrame jInternalFrameParent=(TransporteBeanSwingJInternalFrame)jInternalFrameDetalleFormTransporte.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTransporteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTransporte.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTransporteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTransporte.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTransporte.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTransporte";
		inputMap = this.jButtonNuevoTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransporteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTransporte";
		inputMap = this.jButtonNuevoRelacionesTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransporteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTransporte";
		inputMap = this.jButtonModificarTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTransporte";
		inputMap = this.jButtonActualizarTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTransporte";
		inputMap = this.jButtonEliminarTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTransporte";
		inputMap = this.jButtonCancelarTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTransporte";
		inputMap = this.jButtonCerrarTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTransporte";
		inputMap = this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTransporte.jButtonGuardarCambiosTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTransporte.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTransporteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonidTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransporte.jButtonid_empresaTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonid_empresaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransporte.jButtonid_tipo_via_transporteTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonid_tipo_via_transporteTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtoncodigoTransporteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransporte.jButtonnombreTransporteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransporteBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTransporte.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTransporte"));

		this.jButtonBusquedaPorNombreTransporte.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTransporte"));

		this.jButtonFK_IdTipoViaTransporteTransporte.addActionListener(new ButtonActionListener(this,"FK_IdTipoViaTransporteTransporte"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTransporteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTransporte.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTransporte(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Transporte transporteAux:this.transporteLogic.getTransportes()) {
					transporteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transporte transporteAux:transportes) {
					transporteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTransporteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransporte(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Transporte transporteAux:this.transporteLogic.getTransportes()) {
						transporteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transporte transporteAux:transportes) {
						transporteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Transporte transporteAux:this.transporteLogic.getTransportes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transporte transporteAux:transportes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTransporte(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransporte.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransporte.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransporte,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTransporteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransporte(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTransporte.getSelectedRows();
			
			Transporte transporteLocal=new Transporte();
			
			//this.seleccionarTodosTransporte(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transporteLocal =(Transporte) this.transporteLogic.getTransportes().toArray()[this.jTableDatosTransporte.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					transporteLocal =(Transporte) this.transportes.toArray()[this.jTableDatosTransporte.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				transporteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Transporte transporteAux:this.transporteLogic.getTransportes()) {
						transporteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transporte transporteAux:transportes) {
						transporteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTransporte(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransporte.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransporte.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransporte,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTransporteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTransporteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTransporteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTransporte(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTransporte.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Transporte transporteAux:this.transporteLogic.getTransportes()) {
				
						if(sTipoSeleccionar.equals(TransporteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							transporteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransporteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							transporteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transporte transporteAux:transportes) {
					
						if(sTipoSeleccionar.equals(TransporteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							transporteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransporteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							transporteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTransporte(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTransporteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTransporte(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTransporte=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTransporte.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTransporte) {				
					conSplash=true;//false;										
					
					//this.startProcessTransporte(conSplash);
				
					this.generarReporteTransportesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTransportesSeleccionados();
				//this.jComboBoxTiposAccionesTransporte.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransportesSeleccionados(false);
				//this.jComboBoxTiposAccionesTransporte.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransportesSeleccionados(true);
				//this.jComboBoxTiposAccionesTransporte.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransporte();
				
				this.exportarTransportesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTransportes();
				//this.importarTransportes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransporte();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTransportesSeleccionados();
				//this.jComboBoxTiposAccionesTransporte.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTransporte();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTransporte)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTransporte(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Transporte",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.setSelectedIndex(0);					
				}	
			} 			
			else if(TransporteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTransporte) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTransporte(conSplash);
					
						//this.actualizarParametrosGeneralTransporte();
						
						this.generarReporteProcesoAccionTransportesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTransporte.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TransporteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO TransporteS SELECCIONADOS?", "MANTENIMIENTO DE Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTransporte();
				
						this.actualizarParametrosGeneralTransporte();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.transporteReturnGeneral=transporteLogic.procesarAccionTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.transporteLogic.getTransportes(),this.transporteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTransporteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransporte.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTransporte();
					
					TransporteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTransporteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransporte.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransporte.jComboBoxTiposAccionesFormularioTransporte.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTransporte(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTransporteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTransporte();
			
			if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();		
			Transporte transporte=new Transporte();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTransporte(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTransporte.getSelectedItem();
			
			
			
			
			transportesSeleccionados=this.getTransportesSeleccionados(true);
			//this.sTipoAccion;
			
			if(transportesSeleccionados.size()==1) {
				for(Transporte transporteAux:transportesSeleccionados) {
					transporte=transporteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTransporte();
			
      		//this.finishProcessTransporte(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTransporteReturnGeneral() throws Exception {
		if(this.transporteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.transporteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.transporteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.transporteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.transporteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.transporteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTransporte(false);
		}
		
		if(this.transporteReturnGeneral.getConRetornoLista() || this.transporteReturnGeneral.getConRetornoObjeto()) {
			if(this.transporteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transporteLogic.setTransportes(this.transporteReturnGeneral.getTransportes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.transporteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transporteLogic.setTransporte(this.transporteReturnGeneral.getTransporte());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTransporte(false);
		}
	}
	
	public void actualizarParametrosGeneralTransporte() throws Exception {
		
		
	}
	
	public ArrayList<Transporte> getTransportesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTransporte) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Transporte transporteAux:transporteLogic.getTransportes()) {
					if(transporteAux.getIsSelected()) {
						transportesSeleccionados.add(transporteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transporte transporteAux:this.transportes) {
					if(transporteAux.getIsSelected()) {
						transportesSeleccionados.add(transporteAux);				
					}
				}
			}
			
			if(transportesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						transportesSeleccionados.addAll(this.transporteLogic.getTransportes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						transportesSeleccionados.addAll(this.transportes);				
					}
				}
			}
		} else {
			transportesSeleccionados.add(this.transporte);
		}
		
		return transportesSeleccionados;
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
	
	public void generarReporteTransportesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTransportesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTransportesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransportesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransportesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Transporte",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTransportesSeleccionados() throws Exception {
		ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();		
		
		transportesSeleccionados=this.getTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTransportes("Todos",transportesSeleccionados);
		
	}	
	
	public void generarReporteNormalTransportesSeleccionados() throws Exception {
		ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();		
		
		transportesSeleccionados=this.getTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTransportes("Todos",transportesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTransportesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();
		
		transportesSeleccionados=this.getTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTransportes("Todos",transportesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTransportesSeleccionados() throws Exception {
		ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTransporte();
		
		
		transportesSeleccionados=this.getTransportesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTransporte();
		
		
		//this.generarReporteTransportes("Todos",transportesSeleccionados ,transporteImplementable,transporteImplementableHome);
	}
	
	public void mostrarImportacionTransportes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTransporte();
		
		this.abrirFrameImportacionTransporte();		
		
			
		//this.generarReporteTransportes("Todos",transportesSeleccionados ,transporteImplementable,transporteImplementableHome);
	}
	
	public void importarTransportes() throws Exception {		
	
	}
	
	public void exportarTransportesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTransportesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTransportesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTransportesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Transporte",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTransportesSeleccionados() throws Exception {
		ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();		
		
		transportesSeleccionados=this.getTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transporte."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTransporte(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Transporte transporteAux:transportesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTransporte(transporteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//transporteAux.setsDetalleGeneralEntityReporte(transporteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTransporte(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TransporteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransporteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransporteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransporteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransporteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTransporte(Transporte transporte,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=transporte.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=transporte.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=transporte.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transporte.gettipoviatransporte_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transporte.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transporte.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTransportesSeleccionados() throws Exception {
		ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();		
		
		transportesSeleccionados=this.getTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transporte.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Transportes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTransporte(row);				
				iRow++;
			}				
			
			for(Transporte transporteAux:transportesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTransporte(transporteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTransportesSeleccionados() throws Exception {
		ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();		
		
		transportesSeleccionados=this.getTransportesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transporte.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("transportes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("transporte");
			//elementRoot.appendChild(element);
		
			for(Transporte transporteAux:transportesSeleccionados) {
				element = document.createElement("transporte");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTransporte(transporteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTransporte(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TransporteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TransporteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TransporteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransporteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransporteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTransporte(Transporte transporte,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(transporte.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(transporte.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transporte.gettipoviatransporte_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transporte.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(transporte.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTransporte(Transporte transporte,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TransporteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(transporte.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TransporteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(transporte.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TransporteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(transporte.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoviatransporte_descripcion = document.createElement(TransporteConstantesFunciones.IDTIPOVIATRANSPORTE);
		elementtipoviatransporte_descripcion.appendChild(document.createTextNode(transporte.gettipoviatransporte_descripcion()));
		element.appendChild(elementtipoviatransporte_descripcion);

		Element elementcodigo = document.createElement(TransporteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(transporte.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TransporteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(transporte.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTransportesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Transporte> transportesSeleccionados=new ArrayList<Transporte>();
		
		transportesSeleccionados=this.getTransportesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTransporte(transportesSeleccionados);
		
		this.generarReporteTransportes("Todos",transportesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTransporte(ArrayList<Transporte> transportesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Transporte transporteAux:transportesSeleccionados) {
				transporteAux.setsDetalleGeneralEntityReporte(transporteAux.toString());
			
				if(sTipoSeleccionar.equals(TransporteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					transporteAux.setsDescripcionGeneralEntityReporte1(transporteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE)) {
					existe=true;
					transporteAux.setsDescripcionGeneralEntityReporte1(transporteAux.gettipoviatransporte_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransporteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					transporteAux.setsDescripcionGeneralEntityReporte1(transporteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TransporteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					transporteAux.setsDescripcionGeneralEntityReporte1(transporteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTransporte(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTransporte=true;
				this.isVisibilidadCeldaNuevoRelacionesTransporte=true;
				this.isVisibilidadCeldaGuardarCambiosTransporte=true;
			}
			
			this.isVisibilidadCeldaModificarTransporte=false;
			this.isVisibilidadCeldaActualizarTransporte=false;
			this.isVisibilidadCeldaEliminarTransporte=false;
			this.isVisibilidadCeldaCancelarTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarTransporte=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTransporte=false;
			this.isVisibilidadCeldaModificarTransporte=false;
			this.isVisibilidadCeldaActualizarTransporte=true;
			this.isVisibilidadCeldaEliminarTransporte=false;
			this.isVisibilidadCeldaCancelarTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarTransporte=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTransporte=false;
			this.isVisibilidadCeldaModificarTransporte=false;
			this.isVisibilidadCeldaActualizarTransporte=true;
			this.isVisibilidadCeldaEliminarTransporte=true;
			this.isVisibilidadCeldaCancelarTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarTransporte=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTransporte=false;
			this.isVisibilidadCeldaModificarTransporte=false;
			this.isVisibilidadCeldaActualizarTransporte=true;
			this.isVisibilidadCeldaEliminarTransporte=false;
			this.isVisibilidadCeldaCancelarTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarTransporte=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesTransporte=true;
			this.isVisibilidadCeldaGuardarCambiosTransporte=true;
			this.isVisibilidadCeldaModificarTransporte=false;
			this.isVisibilidadCeldaActualizarTransporte=false;
			this.isVisibilidadCeldaEliminarTransporte=false;
			this.isVisibilidadCeldaCancelarTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarTransporte=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTransporte=false;
			this.isVisibilidadCeldaActualizarTransporte=false;
			this.isVisibilidadCeldaEliminarTransporte=false;
			this.isVisibilidadCeldaCancelarTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarTransporte=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTransporte=false;
			this.isVisibilidadCeldaModificarTransporte=true;
			this.isVisibilidadCeldaActualizarTransporte=false;
			this.isVisibilidadCeldaEliminarTransporte=false;
			this.isVisibilidadCeldaCancelarTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarTransporte=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TransporteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesTransporte=true;
			this.isVisibilidadCeldaGuardarCambiosTransporte=true;
		} else {
			this.actualizarEstadoPanelsTransporte(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTransporte=false;
			//this.isVisibilidadCeldaVerFormTransporte=false;
			this.isVisibilidadCeldaDuplicarTransporte=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!transporteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTransporte=false;
		} else {
			this.isVisibilidadCeldaNuevoTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTransporte=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(transporteSessionBean.getEsGuardarRelacionado()) {
			if(!transporteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTransporte=false;												
			}
			
			this.jButtonCerrarTransporte.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTransporte=false;
		}
		
		if(!this.permiteMantenimiento(this.transporte)) {
			this.isVisibilidadCeldaActualizarTransporte=false;
			this.isVisibilidadCeldaEliminarTransporte=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTransporte() {
	}
	
	public void actualizarEstadoPanelsTransporte(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTransporte!=null) {
				this.jScrollPanelDatosEdicionTransporte.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransporte!=null) {
				this.jTabbedPaneBusquedasTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransporte!=null) {
				this.jScrollPanelDatosTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransporte!=null) {
				this.jPanelPaginacionTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransporte!=null) {
				this.jPanelParametrosReportesTransporte.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTransporte!=null) {
				this.jScrollPanelDatosEdicionTransporte.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransporte!=null) {
				this.jTabbedPaneBusquedasTransporte.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTransporte!=null) {
				this.jScrollPanelDatosTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransporte!=null) {
				this.jPanelPaginacionTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransporte!=null) {
				this.jPanelParametrosReportesTransporte.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTransporte!=null) {
				this.jScrollPanelDatosEdicionTransporte.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransporte!=null) {
				this.jTabbedPaneBusquedasTransporte.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransporte!=null) {
				this.jScrollPanelDatosTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransporte!=null) {
				this.jPanelPaginacionTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransporte!=null) {
				this.jPanelParametrosReportesTransporte.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTransporte!=null) {
				this.jScrollPanelDatosEdicionTransporte.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransporte!=null) {
				this.jTabbedPaneBusquedasTransporte.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransporte!=null) {
				this.jScrollPanelDatosTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransporte!=null) {
				this.jPanelPaginacionTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransporte!=null) {
				this.jPanelParametrosReportesTransporte.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTransporte!=null) {
				this.jScrollPanelDatosEdicionTransporte.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransporte!=null) {
				this.jTabbedPaneBusquedasTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransporte!=null) {
				this.jScrollPanelDatosTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransporte!=null) {
				this.jPanelPaginacionTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransporte!=null) {
				this.jPanelParametrosReportesTransporte.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTransporte!=null) {
				this.jScrollPanelDatosEdicionTransporte.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransporte!=null) {
				this.jTabbedPaneBusquedasTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransporte!=null) {
				this.jScrollPanelDatosTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransporte!=null) {
				this.jPanelPaginacionTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransporte!=null) {
				this.jPanelParametrosReportesTransporte.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTransporte!=null) {
				this.jScrollPanelDatosEdicionTransporte.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransporte!=null) {
				this.jTabbedPaneBusquedasTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransporte!=null) {
				this.jScrollPanelDatosTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransporte!=null) {
				this.jPanelPaginacionTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransporte!=null) {
				this.jPanelParametrosReportesTransporte.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.transporteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTransporte!=null) {
					this.jTabbedPaneBusquedasTransporte.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTransporte!=null) {
				this.jPanelParametrosReportesTransporte.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.transporteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransporte!=null) {
				this.jTabbedPaneBusquedasTransporte.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTransporte!=null) {
				this.jPanelParametrosReportesTransporte.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTransporte.remove(jPanelBusquedaPorCodigoTransporte);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransporte.remove(jPanelBusquedaPorNombreTransporte);}

			this.isVisibilidadFK_IdTipoViaTransporte=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoViaTransporte) {this.jTabbedPaneBusquedasTransporte.remove(jPanelFK_IdTipoViaTransporteTransporte);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoViaTransporte(Boolean isParaTipoViaTransporte){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoViaTransporteNegation=!isParaTipoViaTransporte;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTransporte.remove(jPanelBusquedaPorCodigoTransporte);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransporte.remove(jPanelBusquedaPorNombreTransporte);}

			this.isVisibilidadFK_IdTipoViaTransporte=isParaTipoViaTransporte;
			if(!this.isVisibilidadFK_IdTipoViaTransporte) {this.jTabbedPaneBusquedasTransporte.remove(jPanelFK_IdTipoViaTransporteTransporte);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TransporteSessionBean transporteSessionBean=new TransporteSessionBean();
		
		if(this.transporteSessionBean==null) {
			this.transporteSessionBean=new TransporteSessionBean();
		}
		
		this.transporteSessionBean.setsUltimaBusquedaTransporte(this.getsAccionBusqueda());
		this.transporteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.transporteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			transporteSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			transporteSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			transporteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoViaTransporte")) {
			transporteSessionBean.setid_tipo_via_transporte(this.getid_tipo_via_transporteFK_IdTipoViaTransporte());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TransporteSessionBean transporteSessionBean=new TransporteSessionBean();
		
		if(this.transporteSessionBean==null) {
			this.transporteSessionBean=new TransporteSessionBean();
		}
		
		if(this.transporteSessionBean.getsUltimaBusquedaTransporte()!=null&&!this.transporteSessionBean.getsUltimaBusquedaTransporte().equals("")) {
			this.setsAccionBusqueda(transporteSessionBean.getsUltimaBusquedaTransporte());
			this.setiNumeroPaginacion(transporteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(transporteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(transporteSessionBean.getcodigo());
				transporteSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(transporteSessionBean.getnombre());
				transporteSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(transporteSessionBean.getid_empresa());
				transporteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoViaTransporte")) {
				this.setid_tipo_via_transporteFK_IdTipoViaTransporte(transporteSessionBean.getid_tipo_via_transporte());
				transporteSessionBean.setid_tipo_via_transporte(-1L);
			}
		}
		
		this.transporteSessionBean.setsUltimaBusquedaTransporte("");
		this.transporteSessionBean.setiNumeroPaginacion(TransporteConstantesFunciones.INUMEROPAGINACION);
		this.transporteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTransporte(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTransporte() {
		this.updateBorderResaltarBusquedasFormularioTransporte();
		this.updateVisibilidadBusquedasFormularioTransporte();
		this.updateHabilitarBusquedasFormularioTransporte();
	}
	
	public void updateBorderResaltarBusquedasFormularioTransporte() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTransporte.getComponents().length>0) {
	

		if(this.transporteConstantesFunciones.resaltarBusquedaPorCodigoTransporte!=null) {
			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelBusquedaPorCodigoTransporte);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);
				jPanel.setBorder(this.transporteConstantesFunciones.resaltarBusquedaPorCodigoTransporte);
			}
		}

		if(this.transporteConstantesFunciones.resaltarBusquedaPorNombreTransporte!=null) {
			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelBusquedaPorNombreTransporte);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);
				jPanel.setBorder(this.transporteConstantesFunciones.resaltarBusquedaPorNombreTransporte);
			}
		}

		if(this.transporteConstantesFunciones.resaltarFK_IdTipoViaTransporteTransporte!=null) {
			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelFK_IdTipoViaTransporteTransporte);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);
				jPanel.setBorder(this.transporteConstantesFunciones.resaltarFK_IdTipoViaTransporteTransporte);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTransporte() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTransporte.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelBusquedaPorCodigoTransporte);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transporteConstantesFunciones.mostrarBusquedaPorCodigoTransporte);
			if(!this.transporteConstantesFunciones.mostrarBusquedaPorCodigoTransporte && index>-1) {
				this.jTabbedPaneBusquedasTransporte.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelBusquedaPorNombreTransporte);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transporteConstantesFunciones.mostrarBusquedaPorNombreTransporte);
			if(!this.transporteConstantesFunciones.mostrarBusquedaPorNombreTransporte && index>-1) {
				this.jTabbedPaneBusquedasTransporte.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelFK_IdTipoViaTransporteTransporte);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transporteConstantesFunciones.mostrarFK_IdTipoViaTransporteTransporte);
			if(!this.transporteConstantesFunciones.mostrarFK_IdTipoViaTransporteTransporte && index>-1) {
				this.jTabbedPaneBusquedasTransporte.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTransporte() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTransporte.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelBusquedaPorCodigoTransporte);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transporteConstantesFunciones.activarBusquedaPorCodigoTransporte);
				this.jTabbedPaneBusquedasTransporte.setEnabledAt(index,this.transporteConstantesFunciones.activarBusquedaPorCodigoTransporte);
			}

			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelBusquedaPorNombreTransporte);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transporteConstantesFunciones.activarBusquedaPorNombreTransporte);
				this.jTabbedPaneBusquedasTransporte.setEnabledAt(index,this.transporteConstantesFunciones.activarBusquedaPorNombreTransporte);
			}

			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelFK_IdTipoViaTransporteTransporte);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transporteConstantesFunciones.activarFK_IdTipoViaTransporteTransporte);
				this.jTabbedPaneBusquedasTransporte.setEnabledAt(index,this.transporteConstantesFunciones.activarFK_IdTipoViaTransporteTransporte);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTransporte(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelBusquedaPorCodigoTransporte);

			this.jTabbedPaneBusquedasTransporte.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);

			this.transporteConstantesFunciones.setResaltarBusquedaPorCodigoTransporte(resaltar);

			jPanel.setBorder(this.transporteConstantesFunciones.resaltarBusquedaPorCodigoTransporte);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelBusquedaPorNombreTransporte);

			this.jTabbedPaneBusquedasTransporte.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);

			this.transporteConstantesFunciones.setResaltarBusquedaPorNombreTransporte(resaltar);

			jPanel.setBorder(this.transporteConstantesFunciones.resaltarBusquedaPorNombreTransporte);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoViaTransporte")) {
			index= this.jTabbedPaneBusquedasTransporte.indexOfComponent(this.jPanelFK_IdTipoViaTransporteTransporte);

			this.jTabbedPaneBusquedasTransporte.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransporte.getComponent(index);

			this.transporteConstantesFunciones.setResaltarFK_IdTipoViaTransporteTransporte(resaltar);

			jPanel.setBorder(this.transporteConstantesFunciones.resaltarFK_IdTipoViaTransporteTransporte);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTransporte.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTransporte() throws Exception {

		if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTransporte();
		this.updateVisibilidadResaltarControlesFormularioTransporte();
		this.updateHabilitarResaltarControlesFormularioTransporte();
		
	}
	
	public void updateBorderResaltarControlesFormularioTransporte() throws Exception {
		if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.transporteConstantesFunciones.resaltaridTransporte!=null && this.jInternalFrameDetalleFormTransporte!=null) {this.jInternalFrameDetalleFormTransporte.jLabelidTransporte.setBorder(this.transporteConstantesFunciones.resaltaridTransporte);}
		if(this.transporteConstantesFunciones.resaltarid_empresaTransporte!=null && this.jInternalFrameDetalleFormTransporte!=null) {this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.setBorder(this.transporteConstantesFunciones.resaltarid_empresaTransporte);}
		if(this.transporteConstantesFunciones.resaltarid_tipo_via_transporteTransporte!=null && this.jInternalFrameDetalleFormTransporte!=null) {this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.setBorder(this.transporteConstantesFunciones.resaltarid_tipo_via_transporteTransporte);}
		if(this.transporteConstantesFunciones.resaltarcodigoTransporte!=null && this.jInternalFrameDetalleFormTransporte!=null) {this.jInternalFrameDetalleFormTransporte.jTextFieldcodigoTransporte.setBorder(this.transporteConstantesFunciones.resaltarcodigoTransporte);}
		if(this.transporteConstantesFunciones.resaltarnombreTransporte!=null && this.jInternalFrameDetalleFormTransporte!=null) {this.jInternalFrameDetalleFormTransporte.jTextAreanombreTransporte.setBorder(this.transporteConstantesFunciones.resaltarnombreTransporte);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTransporte() throws Exception {		
		if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransporte!=null) {
	
		//this.jInternalFrameDetalleFormTransporte.jLabelidTransporte.setVisible(this.transporteConstantesFunciones.mostraridTransporte);
		this.jInternalFrameDetalleFormTransporte.jPanelidTransporte.setVisible(this.transporteConstantesFunciones.mostraridTransporte);
		//this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.setVisible(this.transporteConstantesFunciones.mostrarid_empresaTransporte);
		this.jInternalFrameDetalleFormTransporte.jPanelid_empresaTransporte.setVisible(this.transporteConstantesFunciones.mostrarid_empresaTransporte);
		//this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.setVisible(this.transporteConstantesFunciones.mostrarid_tipo_via_transporteTransporte);
		this.jInternalFrameDetalleFormTransporte.jPanelid_tipo_via_transporteTransporte.setVisible(this.transporteConstantesFunciones.mostrarid_tipo_via_transporteTransporte);
		//this.jInternalFrameDetalleFormTransporte.jTextFieldcodigoTransporte.setVisible(this.transporteConstantesFunciones.mostrarcodigoTransporte);
		this.jInternalFrameDetalleFormTransporte.jPanelcodigoTransporte.setVisible(this.transporteConstantesFunciones.mostrarcodigoTransporte);
		//this.jInternalFrameDetalleFormTransporte.jTextAreanombreTransporte.setVisible(this.transporteConstantesFunciones.mostrarnombreTransporte);
		this.jInternalFrameDetalleFormTransporte.jPanelnombreTransporte.setVisible(this.transporteConstantesFunciones.mostrarnombreTransporte);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTransporte() throws Exception {
		if(this.jInternalFrameDetalleFormTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransporte!=null) {
	
		this.jInternalFrameDetalleFormTransporte.jLabelidTransporte.setEnabled(this.transporteConstantesFunciones.activaridTransporte);
		this.jInternalFrameDetalleFormTransporte.jComboBoxid_empresaTransporte.setEnabled(this.transporteConstantesFunciones.activarid_empresaTransporte);
		this.jInternalFrameDetalleFormTransporte.jComboBoxid_tipo_via_transporteTransporte.setEnabled(this.transporteConstantesFunciones.activarid_tipo_via_transporteTransporte);
		this.jInternalFrameDetalleFormTransporte.jTextFieldcodigoTransporte.setEnabled(this.transporteConstantesFunciones.activarcodigoTransporte);
		this.jInternalFrameDetalleFormTransporte.jTextAreanombreTransporte.setEnabled(this.transporteConstantesFunciones.activarnombreTransporte);
		}
	}
	
		
}